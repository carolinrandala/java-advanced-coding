package org.sda.java19;

/**
 * Exception to handle thershold of students in the group
 */
public class MaximumNumberOfStudentsReached extends Exception {
    public MaximumNumberOfStudentsReached(String groupName) {
        super(String.format("Group(name=%s) has reached maximum list of students", groupName));
    }
}
