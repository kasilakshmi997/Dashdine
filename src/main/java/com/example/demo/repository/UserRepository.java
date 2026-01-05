package com.example.demo.repository;

import com.example.demo.model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<user, Long> {
    // Custom query to find a user by email for login/registration checks
    user findByEmail(String email);
}