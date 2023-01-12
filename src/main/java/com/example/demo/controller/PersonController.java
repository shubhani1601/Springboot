package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Person;
import com.example.demo.PersonRepository;
import com.example.demo.PersonService;
import org.springframework.jdbc.core.JdbcTemplate;

@Controller
public class PersonController {
    @Autowired
    private PersonRepository personRepo;
    @Autowired
    private PersonService service;
    @Autowired
    private JdbcTemplate jdbcTemplate;
       
    @GetMapping("/demo2")
    public String listAll(Model model) {
        List<Person> listPeople = personRepo.findAll();
        model.addAttribute("listPeople", listPeople);
           
        return "people";
    }
    
    @PostMapping("/demo2/write")
    public Person write(@RequestBody Person person) {
    	
    	System.out.println("***************************************SUCCESSSSSSSSSSSS*******************************************");
//    	System.out.println(person.email+"  "+person.password);
//        return service.display(person);
    	
    	String sql = "INSERT INTO demo2 (email, password) VALUES (" + "'"+person.email+"', '"+person.password+"')";
    	
     int rows = jdbcTemplate.update(sql);
     if (rows > 0) {
         System.out.println("A new row has been inserted.");
     }
     return service.display(person);
    }
       
}