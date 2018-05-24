package com.study.spring.springcloud.providor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
/**
 * 作为Eureka client
 */
@EnableEurekaClient
public class OrderApp {
	public static void main(String[] args) {
		if (args.length == 0) {
			args = new String[] {"--server.port=8200"};
		}
		SpringApplication.run(OrderApp.class, args);
	}
}
