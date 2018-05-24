package com.study.spring.springcloud.consumer.feign.controller;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("PROVIDOR-USER")
public interface UserController {

	@RequestMapping("/getUser")
	public Map<String, Object> getUser();
}
