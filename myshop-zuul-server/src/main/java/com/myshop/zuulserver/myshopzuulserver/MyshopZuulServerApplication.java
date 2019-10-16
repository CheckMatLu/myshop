package com.myshop.zuulserver.myshopzuulserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class MyshopZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyshopZuulServerApplication.class, args);
	}

}
