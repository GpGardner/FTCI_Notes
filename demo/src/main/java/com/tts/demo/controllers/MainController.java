package com.tts.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping("/")
	public String home() {
		return "Hello World!!";
	}

}
