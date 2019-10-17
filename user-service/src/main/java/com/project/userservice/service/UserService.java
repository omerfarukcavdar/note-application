package com.project.userservice.service;

import com.project.userservice.entity.User;

public interface UserService {

    User save(User user);

    User findById(String id);
}
