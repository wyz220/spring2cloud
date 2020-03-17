package com.wyz.consumer.controller;


import com.wyz.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wuyanzhong
 * @since 2020-03-05
 */
@RestController
@RequestMapping("/user")
public class RestTestController {


    @Value("${user.userServiceUrl}")
    private String userServiceUrl;

    @Autowired
   private RestTemplate restTemplate;

    @RequestMapping("/getById")
    public User getUserById(@RequestParam(defaultValue = "0") Integer id){

        return this.restTemplate.getForObject(userServiceUrl+"/user/getById?id="+id,User.class);

    }
}
