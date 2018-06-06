package com.example.consumer.controller;


import com.demo.api.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.xml.ws.soap.Addressing;

@RestController
public class HelloController {

    @Autowired
    //@Resource(name = "helloService")
    HelloService helloService;

    @GetMapping("/hi")
    public String hi(@RequestParam("name") String name) {
        System.out.println("name = " + name);
        return helloService.sayHi(name);
    }
}
