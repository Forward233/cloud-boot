package com.consumer.service;

import com.consumer.controller.FallBackMethod;
import com.api.service.IUserService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Author: yhl
 * DateTime: 2019/12/8 23:13
 * Description: write some description
 */
// 服务提供方spring.application.name
@FeignClient(name = "cloud-service", fallback = FallBackMethod.class)
public interface UserService extends IUserService {
}
