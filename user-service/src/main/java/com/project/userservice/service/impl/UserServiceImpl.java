package com.project.userservice.service.impl;

import com.project.userservice.entity.User;
import com.project.userservice.repository.UserRepository;
import com.project.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(User user){
       return userRepository.save(user);
    }

    public User findById(String id){
        return userRepository.findById(id).get();
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }
}
