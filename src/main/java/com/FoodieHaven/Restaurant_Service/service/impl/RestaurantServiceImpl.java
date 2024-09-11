package com.FoodieHaven.Restaurant_Service.service.impl;

import com.FoodieHaven.Restaurant_Service.dto.RestaurantDto;
import com.FoodieHaven.Restaurant_Service.entity.RestaurantEntity;
import com.FoodieHaven.Restaurant_Service.repository.RestaurantRepository;
import com.FoodieHaven.Restaurant_Service.service.RestaurantService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<RestaurantDto> getAllRestaurants() {  // getAllRestaurants method
        List<RestaurantEntity> restaurantList = restaurantRepository.findAll();
        return modelMapper.map(restaurantList, new TypeToken<List<RestaurantDto>>() {}.getType());
    }

    @Override
    public RestaurantDto saveRestaurant(RestaurantDto restaurantDto) { // saveRestaurant method
        restaurantRepository.save(modelMapper.map(restaurantDto, RestaurantEntity.class));
        return restaurantDto;
    }

    @Override
    public RestaurantDto updateRestaurant(int id, RestaurantDto restaurantDto) { // updateRestaurant method
        Optional<RestaurantEntity> existingEntity = restaurantRepository.findById(id);
        if (existingEntity.isPresent()) {
            RestaurantEntity entity = existingEntity.get();
            modelMapper.map(restaurantDto, entity);
            restaurantRepository.save(entity);
            return restaurantDto;
        } else {
            throw new RuntimeException("Restaurant not found");
        }
    }

    @Override
    public boolean deleteRestaurant(int id) { // deleteRestaurant method
        if (restaurantRepository.existsById(id)) {
            restaurantRepository.deleteById(id);
            return true;
        } else {
            throw new RuntimeException("Restaurant not found");
        }
    }

    @Override
    public RestaurantDto getRestaurantById(int id) { // getRestaurantById method
        Optional<RestaurantEntity> restaurantEntity = restaurantRepository.findById(id);
        if (restaurantEntity.isPresent()) {
            return modelMapper.map(restaurantEntity.get(), RestaurantDto.class);
        } else {
            throw new RuntimeException("Restaurant not found");
        }
    }
}
