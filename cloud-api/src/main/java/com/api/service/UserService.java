package com.api.service;

import com.api.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Author: yhl
 * DateTime: 2019/12/8 23:13
 * Description: write some description
 */
public interface UserService {
    // 调用police服务的testOut接口
    @RequestMapping("/testOut")
    public Map test(@RequestParam("name") String name);

    // 调用police服务的testOutObj接口
    @RequestMapping("/testOutObj")
    public User testObj(@RequestBody User user);
}
