package org.bridgelabz.siddhu.cgspringgreetingapp.controller;

import org.bridgelabz.siddhu.cgspringgreetingapp.dto.Greeting;
import org.bridgelabz.siddhu.cgspringgreetingapp.repository.GreetingRepository;
import org.bridgelabz.siddhu.cgspringgreetingapp.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
//    private final GreetingService greetingService;
//
//    public GreetingController(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }
//
//
//    @GetMapping
//    public Greeting greeting(
//            @RequestParam(value = "firstName", required = false) String firstName,
//            @RequestParam(value = "lastName", required = false) String lastName){
//        return greetingService.createGreeting(firstName,lastName);
//    }
//
//    @PostMapping
//    public Greeting createGreeting(@RequestBody Greeting greeting){
//        return greetingService.createGreeting(greeting.getFirstName(),greeting.getLastName());
//    }
//


    @Autowired
    private GreetingRepository greetingRepository;
    @Autowired
    private GreetingService greetingService;
    @PostMapping()
    public Greeting saveGreeting(@RequestBody Greeting greeting){
        return greetingRepository.save(greeting);
    }

    @GetMapping("/{id}")
    public Greeting getGreetingById(@PathVariable Long id){
        return greetingRepository.findById(id).orElseThrow(()-> new RuntimeException("No message found with id "+id));
    }

    @GetMapping
    public List<Greeting> getAllGreeting(){
        return greetingRepository.findAll();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Greeting> editGreeting(@PathVariable Long id, @RequestBody Greeting newGreeting){
        Greeting greeting = greetingService.updateGreeting(id,newGreeting.getMessage());
        if(greeting == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(greeting,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public void deleteGreeting(@PathVariable Long id){
        greetingRepository.deleteById(id);
    }
}
