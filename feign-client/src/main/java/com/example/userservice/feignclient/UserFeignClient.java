package com.example.userservice.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @FeignClient 是一个请求的feign调用客户端
 * value 表示请求的相关的server_id 暴露到eureka里面的
 * path  是请求的相关路径
 * contextId 表示相关的feign client模块
 * */
@FeignClient(value ="user-service",path = "/user",contextId = "userFeignClient")
public interface UserFeignClient {

    @GetMapping(value = "/hi")
    String sayHi(@RequestParam("name") String name);
}
