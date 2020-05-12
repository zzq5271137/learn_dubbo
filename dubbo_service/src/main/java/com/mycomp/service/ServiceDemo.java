package com.mycomp.service;

/*
 * 在真实开发中, 会把所有接口单独打一个包, 让dubbo_web项目去引用;
 */

public interface ServiceDemo {

    String hello(String name);

}
