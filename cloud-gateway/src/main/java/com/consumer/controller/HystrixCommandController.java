package com.consumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: yhl
 * DateTime: 2020/1/4 9:04
 * Description: write some description
 */
@RestController
public class HystrixCommandController {

    @RequestMapping("/testOutFail")
    public Map<Object,Object> failTestOut(){
        Map<Object, Object> map = new HashMap<>(2);
        map.put("fail", "gateway");
        map.put("method", "testOut");
        return map;
    }
}
