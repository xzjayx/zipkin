package com.example.userservice.controller;

import com.example.userservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/hi")
    public String hi(@RequestParam("name") String name){
        return userService.sayHi(name);
    }
}
