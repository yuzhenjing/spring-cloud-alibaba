package com.cloud.service;

import com.cloud.HelloFacade;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0", group = "TEST-DEMO")
public class HelloFacadeImpl implements HelloFacade {
    @Override
    public String sayHello(String name) {
        return "你好 " + name;
    }
}
