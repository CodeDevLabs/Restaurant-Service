package com.example.Restaurant_Service.service;

import com.example.Restaurant_Service.dto.RestaurantDto;
import com.example.Restaurant_Service.entity.RestaurantEntity;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Restaurant_Service.repo.RestaurantRepo;

import java.util.List;

@Service
@Transactional
public class RestaurantService {

    @Autowired
    private RestaurantRepo restaurantRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<RestaurantDto> getAllRestaurants(){
        List<RestaurantEntity> restaurantList = restaurantRepo.findAll();
        return modelMapper.map(restaurantList, new TypeToken<List<RestaurantDto>>(){}.getType());
    }

    public RestaurantDto saveRestaurant(RestaurantDto restaurantDto){
        restaurantRepo.save(modelMapper.map(restaurantDto, RestaurantEntity.class));
        return restaurantDto;
    }
    public RestaurantDto updateRestaurant(RestaurantDto restaurantDTO){
        restaurantRepo.save(modelMapper.map(restaurantDTO, RestaurantEntity.class));
        return restaurantDTO;
    }
    public boolean deleteRestaurant(RestaurantDto restaurantDTO){
        restaurantRepo.delete(modelMapper.map(restaurantDTO, RestaurantEntity.class));
        return true;
    }

}
