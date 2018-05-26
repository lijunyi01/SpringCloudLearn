package com.allcom.controller;

import com.allcom.dao.UserRepository;
import com.allcom.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ljy on 2018/5/26.
 * ok
 */
@RestController
public class UserController {
    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        return userRepository.findOne(id);
    }
}
