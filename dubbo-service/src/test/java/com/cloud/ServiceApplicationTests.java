package com.cloud;

import com.api.service.DemoService;
import com.dubbo.ServiceApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ServiceApplication.class)
class ServiceApplicationTests {

    @Autowired
    private DemoService demoService;

    @Test
    public void sayHello() {
        String s = demoService.sayHello("yhl");
        System.out.println(s);
    }

}
