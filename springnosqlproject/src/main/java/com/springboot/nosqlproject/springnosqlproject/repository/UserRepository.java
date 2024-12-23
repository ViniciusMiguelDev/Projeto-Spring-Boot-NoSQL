package com.springboot.nosqlproject.springnosqlproject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.nosqlproject.springnosqlproject.entities.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
    
}
