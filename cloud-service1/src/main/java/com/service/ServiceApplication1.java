package com.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class ServiceApplication1 {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication1.class, args);
    }

}
