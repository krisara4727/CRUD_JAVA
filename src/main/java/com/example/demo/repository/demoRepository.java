package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface demoRepository extends MongoRepository<User, String> {

}
