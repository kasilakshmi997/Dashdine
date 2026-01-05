package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin("*")
public class ProductController {

    @Autowired
    private ProductService productService;

    // Postman URL: GET http://localhost:8080/api/products/menu/{restaurantId}
    @GetMapping("/menu/{resId}")
    public List<Product> getMenuByRestaurant(@PathVariable Long resId) {
        return productService.getMenuByRestaurant(resId);
    }
}