package com.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class ServiceApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication2.class, args);
    }

}
