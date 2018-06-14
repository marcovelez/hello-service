package com.example.helloservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.helloservice.util.NetUtil;

@RestController
public class HelloController {

	@GetMapping("/")
	public String hello() {
		return "Hello " + NetUtil.getHostName() + "!";
	}

}