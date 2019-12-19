package com.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients//开启feign
public class ConsumerApplication1 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication1.class, args);
    }

}
