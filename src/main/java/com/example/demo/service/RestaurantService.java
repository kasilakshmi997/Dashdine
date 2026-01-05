
package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// ADD THESE TWO LINES:
import com.example.demo.model.Restaurant; 
import com.example.demo.repository.RestaurantRepository;

@Service
public class RestaurantService {
    @Autowired
    private RestaurantRepository repo;

    public List<Restaurant> getAll() {
        return repo.findAll();
    }
}