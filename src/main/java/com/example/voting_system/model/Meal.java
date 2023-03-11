package com.example.voting_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "meal", uniqueConstraints = {@UniqueConstraint(columnNames = "name" , name = "meal_unique_name_ids")})
public class Meal extends AbstractBaseEntity{


}
