package com.gateway.controller;

import com.common.model.User;
import com.gateway.service.UserService;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class UserConsumerController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public Map<Object,Object> test(String name) {
        log.info("-----------------------consumer 2");
        return userService.test(name);
    }

    @RequestMapping("/testObj")
    public User testObj() {
        return userService.testObj(new User());
    }

    @RequestMapping("/testNacosDynamicProp")
    public String testNacosDynamicProp() {
        return userService.testNacosDynamicProp();
    }
}
