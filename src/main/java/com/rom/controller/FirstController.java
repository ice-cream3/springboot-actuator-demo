package com.rom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program springboot-mongo-demo
 * @description:
 * @author: hongqizhixing
 * @create: 2019/08/13 20:52
 */
@RestController
public class FirstController {

	@RequestMapping("/getInfo")
	public String getInfo() {
		return "success";
	}

	@RequestMapping("/getError")
	public String getError() {
		int a = 1/0;
		return "success";
	}
}
