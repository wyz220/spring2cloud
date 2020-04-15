package com.wyz.feign;

import com.wyz.config.OpenFeignConfiguration;
import com.wyz.entity.WxUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@FeignClient(name="PROVIDER-USER-FEIGN",configuration = OpenFeignConfiguration.class)
public interface UserFeign extends  BaseFeign{

    @RequestMapping(value = "/user/post", method = RequestMethod.POST)
    public WxUser post(@RequestBody WxUser user);

    @RequestMapping(value = "/user/get1", method = RequestMethod.GET)
    public WxUser get1(@RequestParam("id") Long id, @RequestParam("name") String username);

    @RequestMapping(value = "/user/get2", method = RequestMethod.GET)
    public WxUser get2(@RequestParam Map<String, Object> map);

}
