package com.myshop.configserver.myshopconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MyshopConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyshopConfigServerApplication.class, args);
	}

}
