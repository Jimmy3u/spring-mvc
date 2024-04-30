package com.study.springmvc.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.springmvc.model.User;

public interface UserRepository extends JpaRepository<User, UUID> {
    
}
