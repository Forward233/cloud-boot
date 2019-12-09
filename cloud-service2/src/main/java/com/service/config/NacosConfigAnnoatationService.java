//package com.service.config;
//
//import com.alibaba.nacos.api.config.annotation.NacosValue;
//import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Service;
//
///**
// * @author: yhl
// * @DateTime: 2019/12/9 14:21
// * @Description:
// */
//@Service
//@NacosPropertySource(dataId = "cloud-service.yaml", groupId="DEFAULT_GROUP", autoRefreshed = true)
//public class NacosConfigAnnoatationService implements CommandLineRunner {
//
//
//    private static final Logger LOGGER = LoggerFactory.getLogger(NacosConfigAnnoatationService.class);
//
//    /**
//     * ${name:hello}:key=name,默认值=hello
//     */
//    @NacosValue(value = "${name:hello}", autoRefreshed = true)
//    String name;
//
//    @Override
//    public void run(String... args) throws Exception {
//        while (true) {
//            Thread.sleep(4000);
//            LOGGER.info("[NacosConfigAnnoatationService]注解方式获取到的配置项目,name={}", name);
//        }
//    }
//}
