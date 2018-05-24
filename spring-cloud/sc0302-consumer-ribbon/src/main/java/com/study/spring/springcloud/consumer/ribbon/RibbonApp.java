package com.study.spring.springcloud.consumer.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class RibbonApp {
	public static void main(String[] args) {
		SpringApplication.run(RibbonApp.class, args);
	}

	@Bean
	// 开启负载均衡
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}