package com.cloud.service;

import com.cloud.HelloFacade;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @author yzj
 * @description 测试
 */
@Service
public class HelloService {

    @Reference
    private HelloFacade helloFacade;

    public String sayHello(String name) {
        return helloFacade.sayHello(name);
    }

}
