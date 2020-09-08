package com.dubbo.service;

import com.api.service.DemoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author: yhl
 * @DateTime: 2020/9/8 11:43
 * @Description:
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello " + name;
    }
}
