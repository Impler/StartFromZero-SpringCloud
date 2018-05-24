package com.study.spring.springcloud.providor.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@Value("${server.port}")
	private String port;
	
	@RequestMapping("/getOrder")
	public Map<String, Object> getOrder() {
		Map<String, Object> order = new HashMap<String, Object>();
		order.put("id", "001");
		order.put("name", "苹果");
		order.put("price", 12.5);
		order.put("port", port);
		return order;
	}
}
