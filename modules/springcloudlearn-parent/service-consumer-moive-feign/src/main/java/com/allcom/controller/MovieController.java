package com.allcom.controller;

import com.allcom.entity.User;
import com.allcom.feign.RPCService;
import org.springframework.beans.factory.annotation.Autowired;
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

    final RPCService rpcService;

    @Autowired
    public MovieController(RPCService rpcService) {
        this.rpcService = rpcService;
    }

    @GetMapping("/movie/{id}")
    public User findById(@PathVariable("id") Long id){

        return rpcService.getUserByid(id);
    }
}
