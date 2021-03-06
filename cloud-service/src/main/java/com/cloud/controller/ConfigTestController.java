package com.cloud.controller;

import com.cloud.config.PersonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: yhl
 * DateTime: 2019/12/17 22:31
 * Description: 配置文件测试
 */
@RestController
//@RefreshScope  // 搭配@Value，动态刷新自定义配置文件参数，此注解必须加
public class ConfigTestController {

    // 使用@ConfigurationProperties不需要加@RefreshScope注解，修改nacos中配置，自动刷新。
    @Autowired
    private PersonConfig personConfig;

    @Value("${testName:is null}")
    private String name;

    // 注入配置文件上下文
    // 使用此上下文获取配置文件参数，不需要加@RefreshScope注解
    // 参考[Spring Boot 中读取配置属性的几种方式 - 简书](https://www.jianshu.com/p/2aadd10f655f)
    // ConfigurableApplicationContext applicationContext;
    // applicationContext.getEnvironment().getProperty("user.name")
    @Autowired
    private Environment applicationContext;

    @RequestMapping("/testNacosDynamicProp")
    public String testNacosDynamicProp() {
        String name = applicationContext.getProperty("testName");
        return this.name + "  " + name + ",service=1";
    }

    @RequestMapping("/testConf")
    public void testConfig() {
        System.out.println(personConfig);
    }
}
