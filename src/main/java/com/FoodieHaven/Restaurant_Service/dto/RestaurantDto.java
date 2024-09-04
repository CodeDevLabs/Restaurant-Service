package com.FoodieHaven.Restaurant_Service.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor // Lombok annotation to generate a no-argument constructor
@AllArgsConstructor // Lombok annotation to generate a constructor with all fields as arguments
@Data // Lombok annotation to generate getters, setters, toString, equals, and hashCode methods
public class RestaurantDto { // DTO class representing a restaurant

    @Id // Annotation marking the primary key of the entity, though this is more commonly used in entities, not DTOs
    private int id; // Unique identifier for the restaurant

    private String name; // Name of the restaurant
    private String address; // Address of the restaurant
    private String phone; // Contact phone number for the restaurant
    private String email; // Contact email for the restaurant
    private String description; // Description of the restaurant
    private String imageUrl; // URL to an image representing the restaurant

}

