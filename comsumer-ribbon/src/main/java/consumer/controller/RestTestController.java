package com.wyz.consumer.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.wyz.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.*;
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

    @Autowired
    private LoadBalancerClient loadBalancerClient;
    
    @HystrixCommand(fallbackMethod = "findByIdssFallback2",threadPoolProperties = {
                      @HystrixProperty(name="coreSize",value="1"),
                      @HystrixProperty(name="maxQueueSize",value="20")
    },commandProperties = {
                      @HystrixProperty(name="execution.isolation.strategy",value = "SEMAPHORE ")
    })
    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        ServiceInstance product = loadBalancerClient.choose("product");
        return this.restTemplate.getForObject(userServiceUrl+"/user/"+id,User.class);

    }

    public User findByIdssFallback2(Long id) {
        User user = new User();
        user.setId(-1L);
        user.setName("默认用户");
        return user;
    }
}
