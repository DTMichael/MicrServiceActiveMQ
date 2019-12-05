package com.atguigu.activemqeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
//spring cloud整合activemq的一个小例子
public class ActivemqEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActivemqEurekaApplication.class, args);
    }

}
