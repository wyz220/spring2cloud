package com.wyz.controller;


import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import com.wyz.entity.WxUser;
import com.wyz.feign.UserFeign;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
public class TestFeignController {

    private static Logger log = LoggerFactory.getLogger(TestFeignController.class);

    @Autowired
    private UserFeign userFeignClient;

    @RequestMapping("/{id}")
    public WxUser getUserById(@PathVariable Long id){
        log.info("id -->data {}",id);

        return this.userFeignClient.getById(id);
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public WxUser post(@RequestBody WxUser user){
        log.info("json -- {}"+ user.getName());
        return userFeignClient.post(user);
    }

    @RequestMapping(value = "/get1", method = RequestMethod.GET)
    public WxUser get1(WxUser user){
        return userFeignClient.get1(user.getId(),user.getName());
    }

    @RequestMapping(value = "/get2", method = RequestMethod.GET)
    public WxUser get2(WxUser user){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name",user.getName());
        map.put("nickname",user.getNickname());
        return userFeignClient.get2(map);
    }




}
