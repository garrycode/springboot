package com.qianpen.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/jsp")
public class JSPController {

	@GetMapping("/fun1")
	public String fun1(ModelMap map) {
		map.put("title", "test为jsp的文件名");
		return "test";
	}
}
