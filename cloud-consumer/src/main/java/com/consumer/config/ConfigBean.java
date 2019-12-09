package com.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: yhl
 * @DateTime: 2019/12/9 13:37
 * @Description:
 */

@Configuration
public class ConfigBean {
    /**
     * 默认按顺序轮询
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}

