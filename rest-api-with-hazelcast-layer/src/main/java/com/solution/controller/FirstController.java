package com.solution.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.print.attribute.standard.DateTimeAtCompleted;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FirstController {
  
	@RequestMapping("/request")
	public String greet( ) {
		return "Hi!!!  a request made @ "+ LocalDateTime.now();
	}
	
}
