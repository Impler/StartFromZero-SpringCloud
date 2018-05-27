package com.study.spring.springcloud.consumer.hystrix.feign.service;

import java.util.HashMap;
import java.util.Map;

public class DefaultUserService implements UserService {

	@Override
	public Map<String, Object> getUser() {
		Map<String, Object> defaults = new HashMap<String, Object>();
		defaults.put("errMsg", "服务暂时不可用");
		return defaults;
	}

}
