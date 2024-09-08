package com.FoodieHaven.Restaurant_Service.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RestaurantDto {

    @Id
    private int id; // Unique identifier for the restaurant

    private String name; // Name of the restaurant
    private String address; // Address of the restaurant
    private String phone; // Contact phone number for the restaurant
    private String email; // Contact email for the restaurant
    private String description; // Description of the restaurant
    private String imageUrl; // URL to an image representing the restaurant

}

