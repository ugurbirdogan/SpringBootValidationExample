package com.example.springbootvalidationexample.repository;

import com.example.springbootvalidationexample.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {


}
