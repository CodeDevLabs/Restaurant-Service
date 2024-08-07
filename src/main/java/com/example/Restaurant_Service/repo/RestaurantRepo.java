package com.example.Restaurant_Service.repo;

import com.example.Restaurant_Service.entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepo extends JpaRepository<RestaurantEntity, Integer>{
}
