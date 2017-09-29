package com.catalpa.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by wanchuan on 2017/9/28.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerEncryptApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerEncryptApplication.class, args);
    }
}
