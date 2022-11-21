package org.sda.java19.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {

    private String name;
    private int age;

    // constructor

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
