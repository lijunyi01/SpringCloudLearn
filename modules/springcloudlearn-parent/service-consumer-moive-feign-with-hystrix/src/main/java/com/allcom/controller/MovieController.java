package com.allcom.controller;

import com.allcom.entity.User;
import com.allcom.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ljy on 2018/5/26.
 * ok
 */
@RestController
public class MovieController {

    final UserFeignClient userFeignClient;

    @Autowired
    public MovieController(@Qualifier("userfeignclient") UserFeignClient userFeignClient) {
        this.userFeignClient = userFeignClient;
    }

    @GetMapping("/movie/{id}")
    public User findById(@PathVariable("id") Long id){

        return userFeignClient.getUserByid(id);
    }
}
