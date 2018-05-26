package com.study.spring.springcloud.consumer.feign.service;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("providor-user")
public interface UserService {

	@RequestMapping("/getUser")
	public Map<String, Object> getUser();
}
