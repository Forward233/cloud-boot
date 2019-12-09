package com.service.controller;

import com.common.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
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
@RefreshScope
public class UserServiceProvider {

    @RequestMapping("/testOut")
    public Map test(@RequestParam("name") String name, HttpServletRequest req) {
        Map<Object, Object> map = new HashMap<>();
        map.put("url", req.getRequestURL().toString());
        map.put("name", name);
        return map;
    }

    @RequestMapping("/testOutObj")
    public User testObj(@RequestBody() User user, HttpServletRequest req) {
        user.setUrl(req.getRequestURL().toString()+"&vsersion=2");
        return user;
    }

    @Value("${testName:is null}")
    private String name;

    @RequestMapping("/testNacosDynamicProp")
    public String  testNacosDynamicProp() {
        return name+",service=2";
    }
}
