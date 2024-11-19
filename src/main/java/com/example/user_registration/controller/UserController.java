package com.example.user_registration.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.user_registration.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.user_registration.service.*;



@RestController
@RequestMapping("/user")
public class UserController{

    @Autowired
    private UserService userService;
    @Autowired
    private HashService hashService;

    @PostMapping("/registration")
    public void registerUser(@RequestParam String name, @RequestParam String password, @RequestParam String email) {
        String hashPassword = hashService.doHashing(password);

        User user = new User(name, email, hashPassword);
        userService.saveUser(user);
    }
}