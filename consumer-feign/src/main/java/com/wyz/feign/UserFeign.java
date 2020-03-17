package com.wyz.feign;

import com.config.FeignLogConfiguration;
import com.wyz.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@FeignClient(name = "PROVIDER-USER",configuration = FeignLogConfiguration.class)
public interface UserFeign {
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User getById(@PathVariable("id") Long id);

    // 该请求不会成功
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public User get0(User user);

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public User get1(@RequestParam("id") Long id, @RequestParam("username") String username);

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public User get2(@RequestParam Map<String, Object> map);

    @RequestMapping(value = "/user/post", method = RequestMethod.POST)
    public User post(@RequestBody User user);

}
