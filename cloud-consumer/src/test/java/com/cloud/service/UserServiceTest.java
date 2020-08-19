package com.cloud.service;

import com.api.model.User;
import com.api.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Author: yhl
 * DateTime: 2020/1/9 4:47
 * Description: write some description
 */
@Service
public class UserServiceTest implements IUserService {
    @Override
    public Map<Object, Object> test(String name) {
        return null;
    }

    @Override
    public User testObj(User user) {
        return null;
    }

    @Override
    public String testNacosDynamicProp() {
        return "test mock prop";
    }
}
