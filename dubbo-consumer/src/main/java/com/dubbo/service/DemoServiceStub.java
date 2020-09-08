package com.dubbo.service;

import com.api.service.DemoService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: yhl
 * @DateTime: 2020/9/8 11:05
 * @Description:
 */
@Slf4j
public class DemoServiceStub implements DemoService {
    private final DemoService demoService;


    public DemoServiceStub(DemoService demoService) {
        this.demoService = demoService;
    }

    @Override
    public String sayHello(String name) {
        log.info("before...");
        String result = demoService.sayHello(name);
        log.info("after...");
        return result;
    }
}
