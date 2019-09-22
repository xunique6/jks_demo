package com.paic.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class JksDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JksDemoApplication.class, args);
	}

	@ResponseBody
	@RequestMapping("/hello")
	public String  hello() {
		return "hello jenkins";
	}
	
}
