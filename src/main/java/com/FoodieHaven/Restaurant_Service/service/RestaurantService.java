package com.FoodieHaven.Restaurant_Service.service;

import com.FoodieHaven.Restaurant_Service.dto.RestaurantDto;

import java.util.List;

public interface RestaurantService {
    List<RestaurantDto> getAllRestaurants();

    RestaurantDto saveRestaurant(RestaurantDto restaurantDto);

    RestaurantDto updateRestaurant(int id, RestaurantDto restaurantDto); // Update method to use ID

    boolean deleteRestaurant(int id); // Delete method to use ID
}
