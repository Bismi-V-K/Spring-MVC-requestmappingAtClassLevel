package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Momcontroller {

	@ResponseBody
	@RequestMapping("/sugar")
	public String givesugar() {
		return "Take your sugar";
	}
}
