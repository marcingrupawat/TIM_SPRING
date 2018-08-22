package com.example.demo.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Controller1 {

    @GetMapping("/hello")
    public String sayHello(){
        return "{\"message\": \"hello\"}";
    }
}
