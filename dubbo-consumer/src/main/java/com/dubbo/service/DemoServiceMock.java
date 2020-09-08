package com.dubbo.service;

import com.api.service.DemoService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: yhl
 * @DateTime: 2020/9/8 11:33
 * @Description:
 */
@Slf4j
public class DemoServiceMock implements DemoService {

    @Override
    public String sayHello(String name) {
        log.info("about to execute mock: " + DemoServiceMock.class.getSimpleName());
        return "mock " + name;
    }
}
