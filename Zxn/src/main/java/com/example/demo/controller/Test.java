package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {
	@GetMapping("/index")
	@ResponseBody
	public String say() {
		return "hello";
	}
	@GetMapping("/show")
	@ResponseBody
	public String show() {
		return "good";
	}
	@GetMapping("/dev")
	@ResponseBody
	public String dev() {
		return "dev";
	}
	
}
