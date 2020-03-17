package com.wyz;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EureClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EureClientApplication.class, args);
    }
}
