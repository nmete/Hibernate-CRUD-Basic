package org.hibernate.Test;

import org.hibernate.dto.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentUpdate {


    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("neha");
        EntityManager manager= entityManagerFactory.createEntityManager();

        EntityTransaction transaction= manager.getTransaction();

        Student student= manager.find(Student.class,1);

        student.setFather_name("nilkanth90");

        transaction.begin();
        manager.merge(student);
        transaction.commit();

    }



}
