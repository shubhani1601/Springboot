package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
 
@SpringBootApplication
public class Demo2Application 
//implements CommandLineRunner 
{
 
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
     
    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
    }
 
//    @Override
//    public void run(String... args) throws Exception {
//        String sql = "INSERT INTO users (id, email, password) VALUES (" + "4, 'yutika@gmail.com', 'yp9403')";
//         
//        int rows = jdbcTemplate.update(sql);
//        if (rows > 0) {
//            System.out.println("A new row has been inserted.");
//        }
//    }
 
}
