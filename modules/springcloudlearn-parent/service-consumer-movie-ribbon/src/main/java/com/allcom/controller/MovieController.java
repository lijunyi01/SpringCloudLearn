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

    private final RestTemplate restTemplate;

    @Autowired
    public MovieController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id){
        //service-provider-uesr 可以理解为虚拟ip -- vip；对应于服务提供者在 eureka里显示的名字
        return restTemplate.getForObject("http://service-provider-uesr/user/"+id,User.class);
    }
}
