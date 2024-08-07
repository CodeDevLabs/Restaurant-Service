package com.example.Restaurant_Service.controller;

import com.example.Restaurant_Service.dto.RestaurantDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Restaurant_Service.service.RestaurantService;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/restaurant")
@CrossOrigin

public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;

    @GetMapping(value = "/getRestaurant")
    public List<RestaurantDto> getRestaurant(){
        return restaurantService.getAllRestaurants();
    }

    @PostMapping(value = "/saveRestaurant")
    public RestaurantDto saveRestaurant(@RequestBody RestaurantDto restaurantDto) {
        return restaurantService.saveRestaurant(restaurantDto);
    }

    @PutMapping(value = "/updateRestaurant")
    public RestaurantDto updateRestaurant(@RequestBody RestaurantDto restaurantDto){
        return restaurantService.updateRestaurant(restaurantDto);
    }
    @DeleteMapping(value = "/deleteRestaurant")
    public boolean deleteRestaurant(@RequestBody RestaurantDto restaurantDTO){
        return restaurantService.deleteRestaurant(restaurantDTO);
    }


}
