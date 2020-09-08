package com.dubbo.service;

import com.api.model.User;
import com.api.service.IUserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author: yhl
 * @DateTime: 2020/9/5 2:17
 * @Description:
 */
@Service
public class UserServiceImpl implements IUserService {

    @Override
    public User getUserById(Long id) {
        return User.builder().id(1L).name("yhl").build();
    }
}
