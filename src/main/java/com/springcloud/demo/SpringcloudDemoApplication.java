package com.springcloud.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudDemoApplication {

	public static void main(String[] args) {
		/*SpringApplication.run(SpringcloudDemoApplication.class, args);*/
		SpringApplication application = new SpringApplication(SpringcloudDemoApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		ConfigurableApplicationContext context = application.run(args);

	}

}
