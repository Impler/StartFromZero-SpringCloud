package com.study.spring.springcloud.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @SpringBootApplication包含了以下三个注解的功能：
 * - @SpringBootConfiguration
 * - @EnableAutoConfiguration
 * - @ComponentScan
 * 只不过只能在当前包及其子包下扫描
 */
@SpringBootApplication
/**
 * 启用eureka server
 */
@EnableEurekaServer
public class EurekaServerApp {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApp.class, args);


	}
}
