package com.wyz.controller;

import com.wyz.entity.User;
import com.wyz.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class ApiController {

    @Autowired
    private UserFeign userFeignClient;

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {

        return this.userFeignClient.getById(id);
    }
}
