package com.example.demo.service;

import com.example.demo.model.user;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String registerUser(user newUser) {
        if (userRepository.findByEmail(newUser.getEmail()) != null) {
            return "Email already exists!";
        }
        userRepository.save(newUser);
        return "Registration successful!";
    }

    public user loginUser(String email, String password) {
        user foundUser = userRepository.findByEmail(email);
        // This will no longer crash because getPassword() is now handled by Lombok
        if (foundUser != null && foundUser.getPassword().equals(password)) {
            return foundUser;
        }
        return null;
    }
}