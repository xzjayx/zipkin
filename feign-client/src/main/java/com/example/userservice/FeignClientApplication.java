package com.example.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @EnableFeignClients 开启feignClientS的服务
 * @EnableHystrix 开启hystrix的服务
 * @EnableHystrixDashboard 开启使用Hystrix dashboard 监控熔断器状态
 * */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
public class FeignClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignClientApplication.class, args);
    }

}
