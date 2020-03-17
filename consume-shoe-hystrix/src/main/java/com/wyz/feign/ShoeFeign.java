package com.wyz.feign;

import com.wyz.entity.Shoe;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name = "PROVIDER-SHOE",
                  fallbackFactory = ShoeFeignFactory.class
                  //,fallback = UserFeignCallback.class
)
public interface ShoeFeign {

    @RequestMapping(value = "/shoe/{id}", method = RequestMethod.GET)
    public Shoe getById(@PathVariable("id") Long id);

}
