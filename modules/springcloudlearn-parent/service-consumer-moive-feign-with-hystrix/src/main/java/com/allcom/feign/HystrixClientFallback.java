package com.allcom.feign;

import com.allcom.entity.User;
import org.springframework.stereotype.Component;

/**
 * Created by ljy on 2018/11/30.
 * ok
 */

@Component
public class HystrixClientFallback implements UserFeignClient {

    @Override
    public User getUserByid(Long id){
        User user = new User();
        user.setId(0L);
        return user;
    }

}
