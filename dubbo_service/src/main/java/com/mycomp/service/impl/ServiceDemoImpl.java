package com.mycomp.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mycomp.service.ServiceDemo;

@Service
public class ServiceDemoImpl implements ServiceDemo {

    @Override
    public String getName() {
        return "hello from dubbo service";
    }

}
