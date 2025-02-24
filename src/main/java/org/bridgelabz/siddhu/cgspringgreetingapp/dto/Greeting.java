package org.bridgelabz.siddhu.cgspringgreetingapp.dto;

//public class Greeting {
//    private final String message;
//    private final String firstName;
//    private final String lastName;
//
//    public Greeting(String message, String firstName, String lastName) {
//        this.message = message;
//        this.firstName = firstName;
//        this.lastName = lastName;
//
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//}

import jakarta.persistence.*;

@Entity
public class Greeting{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
//    @Transient //will not be saved in database
//    private String first_name;
//    @Transient //will not be saved in database
//    private String last_name;

    private String message;
    public Greeting(){}
    public Greeting(String message) {
        this.message = message;
    }

    public Greeting(String message, String firstName, String lastName) {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}