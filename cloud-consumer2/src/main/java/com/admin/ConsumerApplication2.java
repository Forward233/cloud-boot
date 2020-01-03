package com.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients//开启feign
public class ConsumerApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication2.class, args);
    }

}
