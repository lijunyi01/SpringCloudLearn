package com.allcom.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ljy on 2018/12/4.
 * ok
 */
@RestController
public class ConfigClientController {

    @Value("${profile}")
    private String profile;
    @Value("${username}")
    private String username;

    @GetMapping("/profile")
    public String getProfile(){
        return this.profile;
    }

    @GetMapping("/user")
    public String getUser() { return this.username; }

}
