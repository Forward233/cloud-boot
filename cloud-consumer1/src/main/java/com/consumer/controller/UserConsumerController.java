package com.consumer.controller;

import com.common.model.User;
import com.consumer.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
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

    @RequestMapping("/testOut")
    public Map<Object,Object> test(String name, HttpServletRequest request) {
        final Map<Object, Object> testMap = userService.test(name);
        testMap.put("consumer port", request.getServerPort());
        return testMap;
    }

    @RequestMapping("/testOutObj")
    public User testObj(HttpServletRequest request) {
        final User user = userService.testObj(new User());
        user.setConsumer("consumer" + request.getServerPort());
        return user;
    }

    @RequestMapping("/testNacosDynamicProp")
    public String testNacosDynamicProp(HttpServletRequest request) {
        return userService.testNacosDynamicProp();
    }
}
