package com.btk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/Hello")
	public String sayhHello() {
		return ("Hello, Bonjour, Ahla w Sahla");
	}

}
