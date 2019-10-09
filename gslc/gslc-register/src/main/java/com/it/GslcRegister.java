package com.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author 伟少
 * 2019/10/9 10:52
 */
@SpringBootApplication
@EnableEurekaServer
public class GslcRegister {
    public static void main(String[] args) {
        SpringApplication.run(GslcRegister.class,args);
    }
}
