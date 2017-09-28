package com.catalpa.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by wanchuan on 2017/9/27.
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableCircuitBreaker
public class MovieFeignHystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(MovieFeignHystrixApplication.class, args);
    }
}
