package org.hibernate.Test;

import org.hibernate.dto.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDelete {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("neha");
        EntityManager manager= entityManagerFactory.createEntityManager();

        EntityTransaction transaction= manager.getTransaction();

        Student student= manager.find(Student.class,1);


        transaction.begin();
        manager.remove(student);

        System.out.println("student object is removed");
        transaction.commit();
    }
}
