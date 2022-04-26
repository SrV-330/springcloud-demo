package com.springcloud.eureka.server;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer2 {
    public static void main(String[] args) {

        SpringApplication application = new SpringApplication(EurekaServer2.class);
        application.setBannerMode(Banner.Mode.OFF);
        ConfigurableApplicationContext context = application.run(args);
    }
}
