package com.study.spring.springcloud.consumer.hystrix.ribbon.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${app.serviceUrl}")
	private String serviceUrl;

	@SuppressWarnings("unchecked")
	public Map<String, Object> getUser() {
		return restTemplate.getForObject(serviceUrl, Map.class);
	}
}
