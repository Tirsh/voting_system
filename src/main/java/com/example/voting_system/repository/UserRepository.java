package com.example.voting_system.repository;

import com.example.voting_system.model.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> getById(int id);
    User addUser(User user);
    boolean deleteUser(int id);
}
