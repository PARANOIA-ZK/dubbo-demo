package com.example.producer.impl;

import com.demo.api.HelloService;
import org.springframework.stereotype.Service;


@Service("helloService")
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHi(String name) {
        return "Hi~ :" + name;
    }
}
