package com.api.service;

import com.api.model.User;

/**
 * @author: yhl
 * @DateTime: 2020/9/5 2:16
 * @Description:
 */
public interface IUserService {
    User getUserById(Long id);
}
