package com.FoodieHaven.Restaurant_Service.repository;

import com.FoodieHaven.Restaurant_Service.entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Integer> {
    // Extends JpaRepository to provide CRUD operations and more for RestaurantEntity

    // No additional code is needed here; JpaRepository provides methods like save(), findAll(), findById(), deleteById(), etc.
}

