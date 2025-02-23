package org.bridgelabz.siddhu.cgspringgreetingapp.services;

import org.bridgelabz.siddhu.cgspringgreetingapp.dto.Greeting;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    @Deprecated
    public Greeting createGreeting(String firstName,String lastName){

        String message;
        if (firstName != null && !firstName.isEmpty() && lastName != null && !lastName.isEmpty()){
            message = "Hello, "+firstName+" "+lastName+"!";
        }
        else if(firstName != null && !firstName.isEmpty()){
            message = "Hello, "+firstName+"!";

        }
        else if(lastName != null && !lastName.isEmpty()){
            message = "Hello, "+lastName+"!";
        }
        else message = "Hello, World!";
        return new Greeting(message,firstName,lastName);
    }

    public Greeting getSimpleGreeting(){
        return new Greeting("Hello World",null,null);
    }
}
