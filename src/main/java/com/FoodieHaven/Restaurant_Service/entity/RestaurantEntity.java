package com.FoodieHaven.Restaurant_Service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RestaurantEntity {

    @Id // Marks this field as the primary key of the entity
    private int id; // Unique identifier for the restaurant entity

    private String name; // Name of the restaurant
    private String address; // Address of the restaurant
    private String phone; // Contact phone number for the restaurant
    private String email; // Contact email for the restaurant
    private String description; // Description of the restaurant
    private String imageUrl; // URL to an image representing the restaurant

}

