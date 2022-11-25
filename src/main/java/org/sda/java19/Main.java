package org.sda.java19;

import org.sda.java19.models.Person;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Personal information
 * a. Create a file containing any personal data (name, surname, phone number). Data of individual persons should be in the following lines.
 * b. Download data from a file and create objects of people based on them (in any way - Regex, String.split ...).
 * c. Enter the created objects into ArrayList or Map (<line number>: <Person>).
 * d. Present the obtained data.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        //Download data from a file and create objects of people based on them (in any way - Regex, String.split ...).
        Path absolutePath = Paths.get("/Users/carolinrandala/Desktop/Learning-java/java-start-basics/java-advanced-coding/src/main/resources/data.txt");
        //Reading file
        List<String> fileLines = Files.readAllLines(absolutePath, StandardCharsets.UTF_8);
        List<Person> dataList = new ArrayList<>();

        for (String fileLine : fileLines) {
            String[] data = fileLine.split(", ");

            Person person = new Person();
            person.setName(data[0]);
            person.setSurname(data[1]);
            person.setPhoneNumber(data[2]);

            dataList.add(person);

            /*System.out.println("First name: " + person.getName());
            System.out.println("Surname: " + person.getSurname());
            System.out.println("Phone number: " + person.getPhoneNumber()); */

            dataList.stream()
                    .sorted(Comparator.comparing(Person::getName))
                    .collect(Collectors.toList())
                    .forEach(person1 -> System.out.println(person));
           /* List<Person> surnameList = new ArrayList<>();
            List<Person> phoneNumberList = new ArrayList<>();*/



        }





        //personalData.setName();
       /* nameDataList.stream()
                .collect(Collectors.groupingBy(PersonalData::getName, Collectors.counting()));
        System.out.println(nameDataList);

       */


        //Map<String,Long> nameMap = nameDataList.stream()

    }
}
