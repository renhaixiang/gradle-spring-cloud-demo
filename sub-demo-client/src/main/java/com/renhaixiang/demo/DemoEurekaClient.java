package com.renhaixiang.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * description: eureka client
 *
 * @author renhaixiang
 * @version 1.0
 * @date 2019/8/16 17:06
 **/
@SpringBootApplication
@EnableEurekaClient
public class DemoEurekaClient {
    public static void main(String[] args) {
        SpringApplication.run(DemoEurekaClient.class,args);
    }
}
