package com.myshop.productmanagementservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

	@Autowired
	private Environment env;

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		System.out.println(
				"********** TEST env EUREKA client: " + env.getProperty("eureka.client.service-url.default-zone"));
		registry.addMapping("/product-management/products*").allowedOrigins("http://192.168.99.101:80",
				"http://192.168.99.101:3000");
	}
}