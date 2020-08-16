package com.dubbo;

import com.api.service.dubbo.IProductService;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ServiceApplicationTests {

    @Reference()
    private IProductService productService;

    @Test
    void contextLoads() {
        productService.getProductById(1L);
    }

}
