package com.wyz.service.impl;

import com.wyz.entity.User;
import com.wyz.mapper.UserMapper;
import com.wyz.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wuyanzhong
 * @since 2020-03-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
