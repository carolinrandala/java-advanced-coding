package org.sda.java19.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Developer extends Person{

    private boolean isMale;

    private String email;


    // Constructor

    public Developer(String name, int age, boolean isMale, String email) {
        super(name, age);
        this.isMale = isMale;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "isMale=" + isMale +
                ", email='" + email + '\'' +
                '}';
    }
}

