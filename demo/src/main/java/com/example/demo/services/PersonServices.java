package com.example.demo.services;

import com.example.demo.model.Person;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {
    private static final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person findById(String id){
        logger.info("Finding one person!");
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setName("Alan");
        person.setLastName("Souza");
        person.setAddress("Lucianopolis");
        person.setGender("Masculino");
        return person;
    }
}
