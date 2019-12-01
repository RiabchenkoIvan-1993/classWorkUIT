package com.company;

import java.io.Serializable;

public class Student implements Serializable {
    protected static String faculty;
    private String name;
    private int id;
    private transient String password;

    public Student(String fak,String name, int id, String password) {
        faculty=fak;
        this.name = name;
        this.id = id;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                "fac='" + faculty + '\'' +
                ", id=" + id +
                ", password='" + password + '\'' +
                '}';
    }
}
