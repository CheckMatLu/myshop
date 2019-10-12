package com.myshop.myshopeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MyshopEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyshopEurekaServerApplication.class, args);
	}

}
