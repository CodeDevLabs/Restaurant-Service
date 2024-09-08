package com.FoodieHaven.Restaurant_Service.controller;

import com.FoodieHaven.Restaurant_Service.dto.RestaurantDto;
import com.FoodieHaven.Restaurant_Service.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/restaurant")
@CrossOrigin
public class RestaurantController {

    @Autowired // Dependency injection of RestaurantService
    private RestaurantService restaurantService;

    @GetMapping(value = "/getRestaurant") // Handles HTTP GET requests for retrieving all restaurants
    public List<RestaurantDto> getRestaurant() {
        return restaurantService.getAllRestaurants();
    }

    @PostMapping(value = "/saveRestaurant") // Handles HTTP POST requests for saving a new restaurant
    public RestaurantDto saveRestaurant(@RequestBody RestaurantDto restaurantDto) {
        return restaurantService.saveRestaurant(restaurantDto);
    }


    @PutMapping("/updateRestaurant/{id}")
    public ResponseEntity<RestaurantDto> updateRestaurant(@PathVariable Integer id, @RequestBody RestaurantDto restaurantDto) {
        RestaurantDto updatedRestaurant = restaurantService.updateRestaurant(id, restaurantDto);
        return ResponseEntity.ok(updatedRestaurant);
    }


    @DeleteMapping(value = "/deleteRestaurant/{id}") // Handles HTTP DELETE requests for deleting a restaurant by ID
    public boolean deleteRestaurant(@PathVariable int id) { // Extracts the restaurant ID from the URL path
        return restaurantService.deleteRestaurant(id);
    }
}
