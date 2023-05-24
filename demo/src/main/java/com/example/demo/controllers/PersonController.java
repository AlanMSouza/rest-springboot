package com.example.demo.controllers;

import com.example.demo.converters.NumberConverter;
import com.example.demo.exceptions.UnsupportedMathOperationException;
import com.example.demo.math.SimpleMath;
import com.example.demo.model.Person;
import com.example.demo.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RequestMapping("/person")
@RestController
public class PersonController {
    private static final AtomicLong counter = new AtomicLong();

    @Autowired
    private PersonServices service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findById(@PathVariable(value = "id") String id) throws Exception {
        return service.findById(id);
    }
}