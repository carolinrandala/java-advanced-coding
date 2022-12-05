package org.sda.java19;

import org.sda.java19.models.Group;
import org.sda.java19.models.Person;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Tasks {

    public void sortByLastName(List<Group> groupList) {
        //#1 Display all students in a group sorted alphabetically by lastName
        for(Group group: groupList) {
            group.setStudents(group.getStudents().stream()
                    .sorted(Comparator.comparing(Person::getLastName))
                    .collect(Collectors.toList()));
        }
    }
    /*public void displayGroupWithMaxStudents(List<Group> groupList) {
        //#2 Display the group with the maximum number of students
        groupList.stream().max(Comparator.comparing(List::size))
                .ifPresent(System.out::println);
    }

     */

    public void displayAllTheStudentsUnder25(List<Group> groupList) {
        //Display all students younger than 25, from all groups
        groupList.forEach(group -> group.getStudents().forEach(student -> {
                if (getAge(student.getDateOfBirth().getYear()) < 25) {
                    System.out.println(student);
                }
            }));
    }
        private int getAge(int yearsOfBirth) {
            return LocalDate.now().getYear() - yearsOfBirth;
        }
    }


