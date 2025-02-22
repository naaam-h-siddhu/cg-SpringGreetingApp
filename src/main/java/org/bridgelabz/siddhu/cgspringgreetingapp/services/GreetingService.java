package org.bridgelabz.siddhu.cgspringgreetingapp.services;

import org.bridgelabz.siddhu.cgspringgreetingapp.dto.Greeting;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public Greeting createGreeting(String name){
        return new Greeting(String.format("Hello, %s!",name));
    }

    public Greeting getSimpleGreeting(){
        return new Greeting("Hello World");
    }
}
