package com.dubbo;

import com.api.service.DemoService;
import com.api.service.IProductService;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConsumerApplicationTest {

    @Reference
    private IProductService productService;

    @Reference(stub = "com.dubbo.service.DemoServiceStub", mock = "com.dubbo.service.DemoServiceMock",timeout = 500)
    private DemoService demoService;

    @Test
    void contextLoads() {
        String s = demoService.sayHello("yhl");
        System.out.println(s);
    }

}
