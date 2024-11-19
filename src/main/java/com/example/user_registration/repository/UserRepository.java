package com.example.user_registration.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.user_registration.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
