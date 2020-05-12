package com.mycomp.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mycomp.service.ServiceDemo;

@Service
public class ServiceDemoImpl implements ServiceDemo {

    @Override
    public String hello(String name) {
        System.out.println("接收到" + name + "的请求, 进行处理...");
        return "hello " + name + "--from dubbo service";
    }

}
