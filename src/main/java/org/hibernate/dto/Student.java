package org.hibernate.dto;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    int id;
    String name;
    String address;

    String mother_name;
    String father_name;
    Long phone;


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMother_name(String mother_name) {
        this.mother_name = mother_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMother_name() {
        return mother_name;
    }

    public String getFather_name() {
        return father_name;
    }

    public Long getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mother_name='" + mother_name + '\'' +
                ", father_name='" + father_name + '\'' +
                ", phone=" + phone +
                '}';
    }
}
