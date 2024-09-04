package com.FoodieHaven.Restaurant_Service.service.impl;

import com.FoodieHaven.Restaurant_Service.dto.RestaurantDto;
import com.FoodieHaven.Restaurant_Service.entity.RestaurantEntity;
import com.FoodieHaven.Restaurant_Service.service.RestaurantService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.FoodieHaven.Restaurant_Service.repository.RestaurantRepository;

import java.util.List;

@Service // Marks the class as a Spring service component, which is a specialization of @Component
@Transactional // Marks the class as transactional, meaning all public methods are wrapped in a transaction
public class RestaurantServiceImpl implements RestaurantService { // Implementation of the RestaurantService interface

    @Autowired // Injecting RestaurantRepository dependency for accessing database operations
    private RestaurantRepository restaurantRepository;

    @Autowired // Injecting ModelMapper dependency for mapping between DTO and entity classes
    private ModelMapper modelMapper;

    public List<RestaurantDto> getAllRestaurants() { // Method to fetch all restaurants from the database
        List<RestaurantEntity> restaurantList = restaurantRepository.findAll(); // Fetches all RestaurantEntity objects from the database
        return modelMapper.map(restaurantList, new TypeToken<List<RestaurantDto>>() {}.getType());
    }

    public RestaurantDto saveRestaurant(RestaurantDto restaurantDto) { // Method to save a new restaurant to the database
        restaurantRepository.save(modelMapper.map(restaurantDto, RestaurantEntity.class)); // Maps RestaurantDto to RestaurantEntity and saves it to the database
        return restaurantDto;
    }

    public RestaurantDto updateRestaurant(RestaurantDto restaurantDTO) { // Method to update an existing restaurant in the database
        restaurantRepository.save(modelMapper.map(restaurantDTO, RestaurantEntity.class)); // Maps RestaurantDto to RestaurantEntity and updates it in the database
        return restaurantDTO;
    }

    public boolean deleteRestaurant(RestaurantDto restaurantDTO) { // Method to delete a restaurant from the database
        restaurantRepository.delete(modelMapper.map(restaurantDTO, RestaurantEntity.class)); // Maps RestaurantDto to RestaurantEntity and deletes it from the database
        return true;
    }

}

