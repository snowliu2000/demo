package com.example.demo.proxy;

/**
 * @author lsl
 * @Date:2019/4/8
 * @Time:14:27
 */
public class HelloImp implements Hello {
    @Override
    public String sayHello(String str) {
        return "HelloImp: " + str;
    }
}
