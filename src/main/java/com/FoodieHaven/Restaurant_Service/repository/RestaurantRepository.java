package com.FoodieHaven.Restaurant_Service.repository;

import com.FoodieHaven.Restaurant_Service.entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Integer> {
    // Repository already supports CRUD operations by ID
}
