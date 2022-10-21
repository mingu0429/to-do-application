package com.todoapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class todoController {
    @GetMapping("/")
    public String helloWorld(){
        return "To-do- Application!";
    }
}
