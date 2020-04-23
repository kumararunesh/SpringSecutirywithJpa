package com.example.securityjpa.repository;

import com.example.securityjpa.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User ,String> {

     Optional<User> findByUserName(String username) ;
}
