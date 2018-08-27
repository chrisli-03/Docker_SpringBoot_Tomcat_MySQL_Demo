package com.example.TianMeow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TianMeow.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
