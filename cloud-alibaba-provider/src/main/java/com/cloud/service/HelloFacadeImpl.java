package com.cloud.service;

import com.cloud.HelloFacade;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

@Slf4j
@Service(version = "1.0.0", group = "TEST-DEMO")
public class HelloFacadeImpl implements HelloFacade {


    @Override
    public String sayHello(String name) {
        log.debug("dubbo 请求过来了");
        return "你好 " + name;
    }

    private void test() {
        log.debug("打印日志");
    }
}
