package org.sda.java19;

import org.sda.java19.models.PersonalData;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
        List<PersonalData> nameDataList = new ArrayList<>();
        List<PersonalData> surnameDataList = new ArrayList<>();
        List<PersonalData> phoneNDataList = new ArrayList<>();

        for (String fileLine : fileLines) {
            String[] data = fileLine.split(", ");
        }

        //Map<String,Long> nameMap = nameDataList.stream()

    }
}
