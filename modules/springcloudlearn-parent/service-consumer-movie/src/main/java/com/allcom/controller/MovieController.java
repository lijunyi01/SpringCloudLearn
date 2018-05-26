package com.allcom.controller;

import com.allcom.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ljy on 2018/5/26.
 * ok
 */
@RestController
public class MovieController {
    @Value("${user.userservicepath}")
    private String userServicePath;

    private final RestTemplate restTemplate;

    @Autowired
    public MovieController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id){
        return restTemplate.getForObject(userServicePath+id,User.class);
    }
}
