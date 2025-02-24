package org.bridgelabz.siddhu.cgspringgreetingapp.services;

import org.bridgelabz.siddhu.cgspringgreetingapp.dto.Greeting;
import org.bridgelabz.siddhu.cgspringgreetingapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GreetingService {
    private final GreetingRepository greetingRepository;
    @Autowired
    GreetingRepository greetingRepository1;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

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
    public Greeting updateGreeting(long id, String greeting){
        Optional<Greeting> optionalGreeting = greetingRepository1.findById(id);
        if(optionalGreeting.isPresent()){
            Greeting greeting1 = optionalGreeting.get();
            greeting1.setMessage(greeting);
            return greetingRepository.save(greeting1);
        }
        else{
            return null;
        }
    }
}
