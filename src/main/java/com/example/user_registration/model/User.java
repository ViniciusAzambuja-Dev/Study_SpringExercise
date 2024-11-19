package com.example.user_registration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
    private int id;
    private String name;
    private String email;
    private String password;

    public User(){}

    public User(String name, String email, String hashPassword){
      this.name = name;
      this.email = email;
      this.password = hashPassword;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
      return email;
    }
}