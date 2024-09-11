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

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping(value = "/getRestaurant")  // Handles HTTP GET
    public List<RestaurantDto> getRestaurant() {
        return restaurantService.getAllRestaurants();
    }

    @GetMapping(value = "/getRestaurant/{id}") // Handles HTTP GET by ID
    public ResponseEntity<RestaurantDto> getRestaurantById(@PathVariable Integer id) {
        RestaurantDto restaurantDto = restaurantService.getRestaurantById(id);
        return ResponseEntity.ok(restaurantDto);
    }

    @PostMapping(value = "/saveRestaurant") // Handles HTTP POST
    public RestaurantDto saveRestaurant(@RequestBody RestaurantDto restaurantDto) {
        return restaurantService.saveRestaurant(restaurantDto);
    }

    @PutMapping("/updateRestaurant/{id}") // Handles HTTP PUT
    public ResponseEntity<RestaurantDto> updateRestaurant(@PathVariable Integer id, @RequestBody RestaurantDto restaurantDto) {
        RestaurantDto updatedRestaurant = restaurantService.updateRestaurant(id, restaurantDto);
        return ResponseEntity.ok(updatedRestaurant);
    }

    @DeleteMapping(value = "/deleteRestaurant/{id}") // Handles HTTP DELETE
    public boolean deleteRestaurant(@PathVariable int id) {
        return restaurantService.deleteRestaurant(id);
    }
}
