package com.example.demo.controller;

import com.example.demo.model.user;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userService;

    // POST http://localhost:8080/api/users/register (Use Body -> raw -> JSON)
    @PostMapping("/register")
    public String register(@RequestBody user user) {
        return userService.registerUser(user);
    }

    // POST http://localhost:8080/api/users/login (Use Body -> x-www-form-urlencoded)
    @PostMapping("/login")
    public user login(@RequestParam String email, @RequestParam String password) {
        return userService.loginUser(email, password);
    }
}