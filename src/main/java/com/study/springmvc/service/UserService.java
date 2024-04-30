package com.study.springmvc.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.springmvc.model.User;
import com.study.springmvc.repository.UserRepository;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return this.userRepository.findAll();
    }

    public User findByUUID(UUID uuid){
        return this.userRepository.getReferenceById(uuid);
    }
}
