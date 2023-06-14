package org.hibernate.Test;

import org.hibernate.dto.Student;

import javax.persistence.*;
import java.util.List;

public class FindAllStudent {

    public static <List> void main(String[] args) {

        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("neha");
        EntityManager manager= entityManagerFactory.createEntityManager();

        EntityTransaction transaction= manager.getTransaction();

        Query query= manager.createQuery("select s from Student s", Student.class);

        java.util.List<Student> list= query.getResultList();

        for(Student s: list){
            System.out.println(s);
            System.out.println("---------------------------");
        }

    }
}
