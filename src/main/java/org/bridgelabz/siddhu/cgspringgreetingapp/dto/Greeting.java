package org.bridgelabz.siddhu.cgspringgreetingapp.dto;

public class Greeting {
    private final String message;
    private final String firstName;
    private final String lastName;

    public Greeting(String message, String firstName, String lastName) {
        this.message = message;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMessage() {
        return message;
    }
}
