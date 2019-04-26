package com.griffiths.hugh.spring.init.rest;

import java.util.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitRestController {
	@RequestMapping("/hello")
	public String hello() {
		return new Date().toString();
	}
}
