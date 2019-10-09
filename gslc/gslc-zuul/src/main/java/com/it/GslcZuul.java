package com.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author 伟少
 * 2019/10/9 11:03
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class GslcZuul {
    public static void main(String[] args) {
        SpringApplication.run(GslcZuul.class,args);
    }
}
