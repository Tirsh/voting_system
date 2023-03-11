package com.example.voting_system.repository;


import com.example.voting_system.model.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
public interface MealRepository extends JpaRepository<Meal, Integer> {

    @Modifying
    @Transactional
    @Query("SELECT m FROM Meal m WHERE m.restaurant.id=:restaurantId")
    List<Meal> getAll(@Param("restaurantId") int id);

}
