package org.sda.java19;

import org.sda.java19.model.JavaDeveloper;

/**
 * Exercise-1
 *
 * Create 3 classes: Person, Developer, JavaDeveloper.
 * a. Person is a parent class, Developer inherits from Person, JavaDeveloper inherits from
 * Developer
 * b. Create constructor for every class that will call constructor of the super class. Each
 * constructor should display an information, that it has been called.
 * c. Create an object of type JavaDeveloper. What information will be displayed and in
 * what order? (create in main)
 * d. Using an object of type JavaDeveloper call a method that is defined in Developer
 * class. What access modifier should it have?
 * e. *Overload method from the Person class in JavaDeveloper class to accept additional
 * parameters.
 */
public class Main {
    public static void main(String[] args) {

        //Exercise 1
        //Create an object of type JavaDeveloper. What information will be displayed and in what order?
        JavaDeveloper javaDeveloper = new JavaDeveloper("Carolin", 25, false, "carolin@gmail.com", "Company", 10);
        System.out.println("Person name is " + javaDeveloper.getName() + " and she works in " + javaDeveloper.getCompany());

        // Using an object of type JavaDeveloper call a method that is defined in Developer class.
        // public or protected
        System.out.println(javaDeveloper.getWorkExperience());

        //e. *Overload method from the Person class in JavaDeveloper class to accept additional parameters.
        javaDeveloper.setName("Tony", "Stark");
        System.out.println(javaDeveloper.getName());
    }
}