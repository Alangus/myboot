package com.alan.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@SpringBootApplication
public class MybootApplication {

	@RequestMapping("/")
	@ResponseBody
	public String hello(){
		return "hello world!";
	}

	public static void main(String[] args) {
		SpringApplication.run(MybootApplication.class, args);
	}
}
