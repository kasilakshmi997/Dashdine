
package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
    // This is the "Magic" method:
    // It automatically finds all food items belonging to one restaurant ID
    List<Product> findByRestaurantId(Long restaurantId);
    
    // Custom method to filter food by category (e.g., 'Veg')
    List<Product> findByCategory(String category);
}