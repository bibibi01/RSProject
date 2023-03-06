package com.bibibi01.toss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class HelloWorldController {
	@GetMapping("/hello")
	public String test() {
		return "hello world!";
	}
}
