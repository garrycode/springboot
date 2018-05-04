package com.qianpen.log.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qianpen.log.util.LogUtil;

@RestController
@RequestMapping("/log")
public class LogController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/fun1")
	public String fun1() {
		logger.info("收到请求。。。");
		LogUtil.test();
		return "success";
	}
}
