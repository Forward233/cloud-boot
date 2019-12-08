package com.service.controller;

import com.api.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: yhl
 * DateTime: 2019/12/8 23:17
 * Description: write some description
 */
public class MyController {
    @RequestMapping("/testOut")
    public Map test(@RequestParam("name") String name, HttpServletRequest req) {
        Map m = new HashMap<>();
        m.put("url", req.getRequestURL().toString());
        m.put("name", name);
        try {
            Thread.sleep(16000);
        } catch (InterruptedException e) {
        }
        return m;
    }

    @RequestMapping("/testOutObj")
    public User testObj(@RequestBody() User user, HttpServletRequest req) {
        user.setUrl(req.getRequestURL().toString());
        try {
            Thread.sleep(14000);
        } catch (InterruptedException e) {
        }
        return user;
    }
}
