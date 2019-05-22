package com.example.userservice.services;

import com.example.userservice.feignclient.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserFeignClient userFeignClient;

    public String sayHi(String name){
        return userFeignClient.sayHi(name);
    }
}
