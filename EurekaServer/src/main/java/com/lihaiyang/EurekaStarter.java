package com.lihaiyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//spring注解
@SpringBootApplication
//开启Eureka注册中心的注解
@EnableEurekaServer
public class EurekaStarter {
       public static void main(String[] args) {
           SpringApplication.run(EurekaStarter.class,args);
       }
}
