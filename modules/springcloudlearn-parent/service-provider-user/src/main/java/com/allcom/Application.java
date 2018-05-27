package com.allcom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//等价于@EnableDiscoveryClient，只是语义更明确，但只能用于注册到eureka
//而@EnableDiscoveryClient 可以注册到zk等其它服务注册器
@EnableEurekaClient
//@EnableDiscoveryClient
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
