package com.gg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	@ResponseBody
	@RequestMapping("/hi")
	public String greetCollege() {
		return "Hi ! welcome to GG world....";
	}
	@RequestMapping("/cool")
	public String beCool() {
		return "trulob";
	}
}
