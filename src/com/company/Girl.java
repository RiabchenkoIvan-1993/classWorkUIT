package com.company;

import java.util.Objects;

public class Girl implements Comparable<Girl> {
    String name;
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Girl girl = (Girl) o;
        return age == girl.age &&
                Objects.equals(name, girl.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Girl(String name, int i) {
        this.name = name;
        this.age = i;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "ket='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Girl girl) {
        return this.age -girl.age;
    }
}
