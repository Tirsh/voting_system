package com.example.voting_system.repository;

import com.example.voting_system.model.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataJpaRestaurantRepository {
    private final RestaurantRepository restaurantRepository;

    public DataJpaRestaurantRepository(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public Restaurant get(int id){
        return restaurantRepository.getReferenceById(id);
    }

    public Restaurant save(Restaurant restaurant){
        restaurantRepository.save(restaurant);
        return restaurant;
    }

    public List<Restaurant> getAll(){
        return restaurantRepository.findAll();
    }

    public boolean delete(int id){
        return restaurantRepository.delete(id) != 0;
    }

}
