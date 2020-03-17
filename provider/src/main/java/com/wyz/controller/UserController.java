package com.wyz.controller;


import com.wyz.entity.User;
import com.wyz.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
public class UserController {


    @Autowired
    protected IUserService userService;

    @RequestMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        System.out.println("id=>"+id);
        return this.userService.getById(id);
    }

    @PostMapping("/post")
    public User post(@RequestBody User user) {
        return user;
    }
}
