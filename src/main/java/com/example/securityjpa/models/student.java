package com.example.securityjpa.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class student {

    @Id
    @GeneratedValue
    int id ;
    String name;
    String marks;

    public student() {

    }

    public student(String name, String marks) {
        this.name = name;
        this.marks = marks;
    }

    public student(int id, String name, String marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }
}
