package com.wyz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.wyz.mapper")  //配置mapper扫描
@EnableEurekaClient
public class ShoeProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoeProviderApplication.class,args);
    }
}
