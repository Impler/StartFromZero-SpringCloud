package com.study.spring.springcloud.consumer.ribbon.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.spring.springcloud.consumer.ribbon.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/getUser")
	public Map<String, Object> getUser(){
		return userService.getUser();
	}
}
