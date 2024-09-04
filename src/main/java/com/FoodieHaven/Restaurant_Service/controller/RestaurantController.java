package com.FoodieHaven.Restaurant_Service.controller;

import com.FoodieHaven.Restaurant_Service.dto.RestaurantDto;
import com.FoodieHaven.Restaurant_Service.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.FoodieHaven.Restaurant_Service.service.impl.RestaurantServiceImpl;

import java.util.List;

@RestController // Marks the class as a Spring REST controller
@RequestMapping(value = "api/v1/restaurant") // Base URL for all endpoints in this controller
@CrossOrigin // Allows Cross-Origin requests, useful when working with front-end clients on different domains

public class RestaurantController {

    @Autowired // Dependency injection of RestaurantService
    private RestaurantService restaurantService;

    @GetMapping(value = "/getRestaurant") // Handles HTTP GET requests for retrieving all restaurants
    public List<RestaurantDto> getRestaurant(){
        return restaurantService.getAllRestaurants();
    }

    @PostMapping(value = "/saveRestaurant") // Handles HTTP POST requests for saving a new restaurant
    public RestaurantDto saveRestaurant(@RequestBody RestaurantDto restaurantDto) {
        return restaurantService.saveRestaurant(restaurantDto);
    }

    @PutMapping(value = "/updateRestaurant") // Handles HTTP PUT requests for updating an existing restaurant
    public RestaurantDto updateRestaurant(@RequestBody RestaurantDto restaurantDto){
        return restaurantService.updateRestaurant(restaurantDto);
    }

    @DeleteMapping(value = "/deleteRestaurant") // Handles HTTP DELETE requests for deleting a restaurant
    public boolean deleteRestaurant(@RequestBody RestaurantDto restaurantDTO){
        return restaurantService.deleteRestaurant(restaurantDTO);
    }

}

