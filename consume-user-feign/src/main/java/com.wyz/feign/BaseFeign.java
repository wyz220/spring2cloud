package com.wyz.feign;

import com.wyz.entity.WxUser;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface BaseFeign {

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public WxUser getById(@PathVariable("id") Long id);

}
