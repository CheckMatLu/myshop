package com.myshop.productmanagementservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.myshop.productmanagementservice")
public class ProductManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductManagementServiceApplication.class, args);
	}

}
