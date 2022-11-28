package org.sda.java19.models;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Student extends Person{
    private boolean hasPreviousJavaKnowledge;
}
