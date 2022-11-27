package org.sda.java19;

import org.sda.java19.models.Person;

import java.io.*;
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
        /*//Download data from a file and create objects of people based on them (in any way - Regex, String.split ...).
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
            System.out.println(dataList);



*/


            //Enter the created objects into Array from the file:

            String path = "/Users/carolinrandala/Desktop/Learning-java/java-start-basics/java-advanced-coding/src/main/resources/data.txt";
            String line = "";
            int lineCount = 0;

            try {
                BufferedReader br = new BufferedReader(new FileReader(path));
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");
                    lineCount++;
                    System.out.println(lineCount + " Name: " + values[0] + "\nSurname:" + values[1] + "\nPhonenumber:" + values[2]);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


           /* dataList.stream()
                    .sorted(Comparator.comparing(Person::getName))
                    .collect(Collectors.toList())
                    .forEach(person1 -> System.out.println(person));*/


        }
    }







