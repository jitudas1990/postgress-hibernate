package com.example.postgresqldemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.postgresqldemo.dto.FlightBookingAcknowledgement;
import com.example.postgresqldemo.dto.FlightBookingRequest;
import com.example.postgresqldemo.model.Person;
import com.example.postgresqldemo.service.FlightBookingService;
import com.example.postgresqldemo.service.PersonService;

@RestController
public class Sample {
    @Autowired
    private FlightBookingService flightBookingService;
    @Autowired
    private PersonService personService;
    @GetMapping("/get")
    public String getMessage(){

        return "Hello world";
    }
    @GetMapping("/getEmployees")
    public List<Person> getPersons(){

        return  personService.getPersonDetails();
    }
    @PostMapping("/saveEmployee")
    public Person createPerson(@RequestBody Person person){
        System.out.println("oooooooooooooooooo");
        return personService.savePersondetails(person);
    }

    @PostMapping("/flight")
    public FlightBookingAcknowledgement bookFlight(@RequestBody  FlightBookingRequest request){
        return  flightBookingService.bookFlightTicket(request);
    }
}
