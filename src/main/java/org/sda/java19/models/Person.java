package org.sda.java19.models;

import lombok.*;

/**
 * Person model
 *
 * @author Carolin
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
    private String email;
}