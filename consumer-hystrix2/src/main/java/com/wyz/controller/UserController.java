package com.wyz.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.wyz.entity.User;
import com.wyz.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserFeign userFeignClient;

    @Autowired
    private RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "findByIdssFallback2",threadPoolProperties = {
                      @HystrixProperty(name="coreSize",value="1"),
                      @HystrixProperty(name="maxQueueSize",value="20")
    },commandProperties = {
                      @HystrixProperty(name="execution.isolation.strategy",value = "SEMAPHORE")
    })
    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {

        return this.userFeignClient.getById(id);
    }
/*
    @HystrixCommand(fallbackMethod = "findByIdssFallback2",threadPoolProperties = {
                      @HystrixProperty(name="coreSize",value="1"),
                      @HystrixProperty(name="maxQueueSize",value="20")
    },commandProperties = {
                      @HystrixProperty(name="execution.isolation.strategy",value = "SEMAPHORE")
    })
    @GetMapping("/{id}")
    public User findById2(@PathVariable Long id) {

        return this.restTemplate.getForObject("http://localhost:8880/user/"+id,User.class);


    }*/



    public User findByIdssFallback2(Long id) {
        User user = new User();
        user.setId(-1L);
        user.setName("默认用户");
        return user;
    }


}
