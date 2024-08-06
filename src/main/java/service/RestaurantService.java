package service;

import dto.RestaurantDTO;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.RestaurantRepo;

@Service
@Transactional
public class RestaurantService {
    @Autowired
    private RestaurantRepo restaurantRepo;
    public String saveRestaurant(RestaurantDTO restaurantDTO){
        restaurantRepo.save(restaurantDTO);
    }
}
