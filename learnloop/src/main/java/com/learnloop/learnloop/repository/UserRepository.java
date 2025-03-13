package com.learnloop.learnloop.repository;

import com.learnloop.learnloop.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    // You can define custom queries here if needed
}