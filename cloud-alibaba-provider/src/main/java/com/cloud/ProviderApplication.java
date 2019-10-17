package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author yzj
 * 服务端启动类
 */
@SpringCloudApplication
public class ProviderApplication {


    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

}
