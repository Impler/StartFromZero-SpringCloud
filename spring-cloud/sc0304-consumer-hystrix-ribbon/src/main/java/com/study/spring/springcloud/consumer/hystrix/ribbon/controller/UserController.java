package com.study.spring.springcloud.consumer.hystrix.ribbon.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.study.spring.springcloud.consumer.hystrix.ribbon.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/getUser")
	@HystrixCommand(fallbackMethod="fallfackMethod")
	public Map<String, Object> getUser(){
		return userService.getUser();
	}
	
	public Map<String, Object> fallfackMethod(){
		Map<String, Object> defaults = new HashMap<String, Object>();
	}
}
