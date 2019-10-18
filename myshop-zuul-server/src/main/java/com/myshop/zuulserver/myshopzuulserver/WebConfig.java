package com.myshop.zuulserver.myshopzuulserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

	@Value("${frontManagement.url}")
	private String allowedOrigin;

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		// System.out.println("********** TEST env front client: " +
		// env.getProperty("frontManagement.url"));
		registry.addMapping("/product-management/products*").allowedOrigins(allowedOrigin);
		// .allowedOrigins(env.getProperty("frontManagement.url"));
	}
}