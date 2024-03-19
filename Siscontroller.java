package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class Siscontroller {

	@ResponseBody
	@RequestMapping("/makeup")
	public String makeup() {
		return "Take my makeup";
	}
	
	@ResponseBody
	@RequestMapping("/book")
	public String book() {
		return "Take my book";
	}
}
