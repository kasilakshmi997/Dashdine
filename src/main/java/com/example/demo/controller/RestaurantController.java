
package com.example.demo.controller;

import com.example.demo.model.Restaurant;
import com.example.demo.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/restaurants")
@CrossOrigin("*")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    // Postman URL: GET http://localhost:8080/api/restaurants/all
    @GetMapping("/all")
    public List<Restaurant> getAllRestaurants() {
        return restaurantService.getAll();
    }
}
