package org.sda.java19.models;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public void setDateOfBirth(int i, int i1, int i2) {
    }
}
