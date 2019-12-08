package com.consumer.controller;

import com.api.model.User;
import com.consumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Author: yhl
 * DateTime: 2019/12/8 23:12
 * Description: write some description
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public Map test() {
        return userService.test("张三");
    }

    @RequestMapping("/testObj")
    public User testObj() {
        return userService.testObj(new User());
    }
}
