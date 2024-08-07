package com.example.Restaurant_Service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RestaurantDto {
    private int id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String description;
    private String imageUrl;
}
