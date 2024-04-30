package com.study.springmvc.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.study.springmvc.model.User;
import com.study.springmvc.service.UserService;

// Rabdom things to see how thymleaf works, will delete later
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @ModelAttribute("allUsers")
    public List<User> populateUsers(){
        return this.userService.findAll();
    }

    @GetMapping("/user")
    public String returnUsers(final User user) {
        return "users";
    }

    @GetMapping("/user/{uuid}")
    public String returnIndividualUser(@PathVariable UUID uuid, Model model) {
        model.addAttribute("user",
                            this.userService.findByUUID(uuid));
        return "userPage";
    }
    

    
}
