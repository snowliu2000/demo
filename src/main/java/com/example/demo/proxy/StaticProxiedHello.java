package com.example.demo.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author lsl
 * @Date:2019/4/8
 * @Time:14:27
 */
@Slf4j
public class StaticProxiedHello implements Hello {
    private Hello hello = new HelloImp();
    @Override

    public String sayHello(String str) {
        log.info("You said: " + str);

        return hello.sayHello(str);
    }
}
