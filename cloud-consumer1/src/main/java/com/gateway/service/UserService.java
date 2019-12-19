package com.gateway.service;

import com.common.service.IUserService;
import com.gateway.controller.FallBackMethod;
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
