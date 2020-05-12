package com.mycomp.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mycomp.service.ServiceDemo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDemo {

    @Reference
    private ServiceDemo service;

    @RequestMapping("/getHello")
    public String getHello(@RequestBody String name) {
        System.out.println(name + "请求远端dubbo服务...");
        return service.hello(name);
    }

}
