package com.example.demo;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "demo2")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;
 
    @Column(name="email")
    public String email;
    @Column(name = "password")
    public String password;
 
    Person(String m, String p)
    {
    	email=m;
    	password = p;
    }
    
    // getters and setters...
    
}
