package com.example.voting_system;

import com.example.voting_system.model.Meal;
import com.example.voting_system.repository.DataJpaMealRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VotingSystemApplication {

    public static void main(String[] args) {

        SpringApplication.run(VotingSystemApplication.class, args);
    }

}
