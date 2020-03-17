package com.wyz.feign;

import com.wyz.entity.User;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class UserFeignCallback implements  UserFeign {

    @Override
    public User getById(Long id) {
        User user = new User();
        user.setId(-1L);
        user.setUsername("默认用户");
        return user;
    }

    @Override
    public User get0(User user) {
        return null;
    }

    @Override
    public User get1(Long id, String username) {
        return null;
    }

    @Override
    public User get2(Map<String, Object> map) {
        return null;
    }

    @Override
    public User post(User user) {
        return null;
    }
}
