package com.qianpen.jsp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/encode")
public class EncodController {

	@GetMapping("/fun1")
	public String fun1() {
		return "哈哈乱码吗？";
	}
}
