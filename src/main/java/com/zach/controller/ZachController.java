package com.zach.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ZachController {
	
	@GetMapping("/abc")
	public String display() {
		return "Welcome to the world of SpringBoot Application";
	}
}
