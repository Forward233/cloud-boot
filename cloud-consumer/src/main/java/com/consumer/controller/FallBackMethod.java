package com.consumer.controller;

import com.consumer.service.UserService;
import com.api.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: yhl
 * DateTime: 2019/12/10 22:35
 * Description: write some description
 */
@Service
public class FallBackMethod implements UserService {

    @Override
    public Map<Object, Object> test(String name) {
        Map<Object, Object> map = new HashMap<>();
        map.put("fail", "fallback");
        return map;
    }

    @Override
    public User testObj(User user) {
        return User.builder().url("failUrr").build();
    }

    @Override
    public String testNacosDynamicProp() {
        return null;
    }
}
