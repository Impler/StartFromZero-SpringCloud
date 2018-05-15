package com.study.spring.springcloud.providor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
/**
 * 作为Eureka client
 */
@EnableEurekaClient
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
