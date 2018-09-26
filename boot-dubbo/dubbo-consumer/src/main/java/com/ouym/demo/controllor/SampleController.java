package com.ouym.demo.controllor;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ouym.demo.model.User;
import com.ouym.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: ouym
 * @Description:
 * @Date: Created in 19:25 2018/9/19
 * @Modified By:
 */
@RestController
public class SampleController {

    @Resource
    private UserService userService;

    @RequestMapping("/")
    String home() {
        User user = userService.getById(16);
        return user.getUsername();
    }


}
