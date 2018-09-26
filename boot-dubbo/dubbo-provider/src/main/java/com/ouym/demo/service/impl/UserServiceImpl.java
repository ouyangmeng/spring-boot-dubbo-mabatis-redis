package com.ouym.demo.service.impl;

//import com.ouym.demo.dao.UserMapper;
import com.alibaba.dubbo.config.annotation.Service;
import com.ouym.demo.mapper.UserMapper;
import com.ouym.demo.model.User;
import com.ouym.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;

/**
 * @Author: ouym
 * @Description:
 * @Date: Created in 19:41 2018/9/21
 * @Modified By:
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Cacheable(value="getById",key="1")
    public User getById(Integer userId) {

        User user = userMapper.getById(16);
        System.out.println(user.getUsername());
        return user;
    }
}
