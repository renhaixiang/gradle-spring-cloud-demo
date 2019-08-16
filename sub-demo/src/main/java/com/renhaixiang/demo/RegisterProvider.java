package com.renhaixiang.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * description: eureka provider
 *
 * @author renhaixiang
 * @version 1.0
 * @date 2019/8/16 16:16
 **/
@SpringBootApplication
@EnableEurekaServer
public class RegisterProvider {
    public static void main(String[] args) {
        SpringApplication.run(RegisterProvider.class,args);
    }
}
