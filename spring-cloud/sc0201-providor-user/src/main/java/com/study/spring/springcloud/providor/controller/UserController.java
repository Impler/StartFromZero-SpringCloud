package com.study.spring.springcloud.providor.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Value("${server.port}")
	private String port;
	
	@RequestMapping("/getUser")
	public Map<String, Object> getUser() {
		Map<String, Object> user = new HashMap<String, Object>();
		user.put("name", "张三");
		user.put("age", 22);
		user.put("sex", 0);
		user.put("port", port);
		return user;
	}
}
