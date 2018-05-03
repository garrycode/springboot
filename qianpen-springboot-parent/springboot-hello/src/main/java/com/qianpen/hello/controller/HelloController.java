package com.qianpen.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
* @ClassName: HelloController 
* @Description: TODO
* @author Jihua Yi
* @date 2018年5月3日 下午5:22:01 
*
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping("/fun1")
	public String fun1() {
		return "hello springboot!";
	}
}
