package com.project.userservice.controller;

import com.project.userservice.entity.User;
import com.project.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User createUser(@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping("/users")
    public List<User> findAllUsers(){
        return userService.findAll();
    }

    @GetMapping("/user/{id}")
    public User findUserById(@PathVariable String id){
        return userService.findById(id);
    }
}
