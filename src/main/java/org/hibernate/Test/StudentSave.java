package org.hibernate.Test;

import org.hibernate.dto.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentSave {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("neha");
        EntityManager entityManager= entityManagerFactory.createEntityManager();

        EntityTransaction entityTransaction= entityManager.getTransaction();

        Student student= new Student(); // to save in database

        student.setId(2);
        student.setName("neha");
        student.setFather_name("nilkanth mete");
        student.setAddress("latur");
        student.setMother_name("sangu");
        student.setPhone(99087l);

        entityTransaction.begin();

        entityManager.persist(student);
        entityTransaction.commit();

    }
}
