package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@RequestMapping("/home")
	@ResponseBody
	public String goHome() {
		return "HomePage,Hello Word!";
	}

	@RequestMapping("/index")
	@ResponseBody
	public String sayHi(String name) {
		return "Hi,"+name;
    }
	@RequestMapping("/pollTest")
	@ResponseBody
	public String testPoll(String name) {
		return "Hi,"+name;
	}
}
