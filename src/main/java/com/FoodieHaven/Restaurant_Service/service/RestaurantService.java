package com.FoodieHaven.Restaurant_Service.service;

import com.FoodieHaven.Restaurant_Service.dto.RestaurantDto;

import java.util.List;

public interface RestaurantService {
    List<RestaurantDto> getAllRestaurants();

    RestaurantDto saveRestaurant(RestaurantDto restaurantDto);

    RestaurantDto updateRestaurant(int id, RestaurantDto restaurantDto);

    boolean deleteRestaurant(int id);

    RestaurantDto getRestaurantById(int id); // New method
}
