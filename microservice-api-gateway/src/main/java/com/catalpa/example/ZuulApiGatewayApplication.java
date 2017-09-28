package com.catalpa.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by wanchuan on 2017/9/28.
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApiGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApiGatewayApplication.class, args);
    }
}
