package com.dubbo.controller;

import com.api.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: yhl
 * DateTime: 2019/12/8 23:17
 * Description: write some description
 */
@RestController
@Slf4j
public class UserServiceProvider {


    @RequestMapping("/testOut")
    public Map<Object, Object> test(@RequestParam("name") String name, HttpServletRequest req) {
        log.info("--------name:{}--------", name);
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        Map<Object, Object> map = new HashMap<>();
        map.put("url", req.getRequestURL().toString());
        map.put("name", name);
        map.put("service port", req.getServerPort());
        return map;
    }

    @RequestMapping("/testOutObj")
    public User testObj(@RequestBody() User user, HttpServletRequest req) {
        user.setUrl(req.getRequestURL().toString());
        user.setService("service" + req.getServerPort());
        return user;
    }
}
