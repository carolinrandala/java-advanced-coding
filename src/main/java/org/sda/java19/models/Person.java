package org.sda.java19.models;

import lombok.Data;
import lombok.ToString;

/**
 * Creating objects from information data.txt file
 * @author carolinrandala
 */
@Data
@ToString
public class Person {
    private String name;
    private String surname;
    private String phoneNumber;

}
