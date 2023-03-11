package com.example.voting_system.repository;

import com.example.voting_system.model.Meal;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataJpaMealRepository {
    private final MealRepository mealRepository;

    public DataJpaMealRepository(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    public Meal save(Meal meal, int restaurants){
        return null;
    }

    public Meal get(int id){
        return mealRepository.getReferenceById(id);
    }

    public List<Meal> getAllFromRestaurantId(int restaurantId){
        return mealRepository.getAll(restaurantId);
    }


}
