package com.allcom.feign;

import com.allcom.entity.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ljy on 2018/5/29.
 * ok
 */
//服务提供者的应用名（或者可以理解为vip）
@FeignClient(value = "service-provider-user",fallback = HystrixClientFallback.class)
@Qualifier("userfeignclient")
public interface UserFeignClient {
    //注意：feign不支持GetMapping等复合注解
    @RequestMapping(method = RequestMethod.GET,value = "/user/{id}")
    User getUserByid(@PathVariable("id") Long id);
}
