package com.study.spring.springcloud.consumer.hystrix.feign.service;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="providor-user", fallback=DefaultUserService.class)
public interface UserService {

	@RequestMapping("/getUser")
	public Map<String, Object> getUser();
}
