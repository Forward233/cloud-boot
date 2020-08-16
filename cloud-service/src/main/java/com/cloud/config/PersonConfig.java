package com.cloud.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author: yhl
 * @DateTime: 2019/12/20 10:58
 * @Description:
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "person")
public class PersonConfig {
    private String name;
    private String gender;
    private int age;
}
