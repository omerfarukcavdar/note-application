package com.project.userservice.service;

import com.project.userservice.entity.User;

import java.util.List;

public interface UserService {

    User save(User user);

    User findById(String id);

    List<User> findAll();
}
