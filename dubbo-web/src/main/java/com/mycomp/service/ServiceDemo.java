package com.mycomp.service;

/*
 * 这里写的这个接口只是为了能够找到方法, 它的定义与dubbo_service项目中的接口一模一样;
 * 真实开发中, 会直接将dubbo_service中的所有接口打一个包, 然后在dubbo_web项目中引用就可以了, 不需要写这个接口;
 */

public interface ServiceDemo {

    String hello(String name);

}
