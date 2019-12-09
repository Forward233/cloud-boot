package com.common.service;

import com.common.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Author: yhl
 * DateTime: 2019/12/8 23:13
 * Description: write some description
 */
public interface IUserService {

    @RequestMapping("/testOut")
    Map<Object,Object> test(@RequestParam("name") String name);

    @RequestMapping("/testOutObj")
    User testObj(@RequestBody User user);

    @RequestMapping("/testNacosDynamicProp")
    String testNacosDynamicProp();
}
