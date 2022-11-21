package org.sda.java19.model;

import lombok.*;

@Getter
@Setter
@ToString

public class JavaDeveloper extends Developer {

    private String company;
    private int workExperience;

    // Constructor


    public JavaDeveloper(String name, int age, boolean isMale, String email, String company, int workExperience) {
        super(name, age, isMale, email);
        this.company = company;
        this.workExperience = workExperience;
    }




    // Overload method from the Person class in JavaDeveloper class to accept additional parameters.
    // Same method name, but different number of parameters
    public void setName(String firstName, String lastName) {
        super.setName(firstName.concat(lastName));
    }

}

