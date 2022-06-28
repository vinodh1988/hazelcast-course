package com.solution.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hazelcast.topic.ITopic;

@RestController
@RequestMapping("/api")
public class FirstController {
	
	@Autowired
	ITopic<String> topic;
  
	@RequestMapping("/request")
	public String greet( ) {
		topic.publish("A request has been made @ "+LocalDateTime.now());
		return "Hi!!!  a request made @ "+ LocalDateTime.now();
	}
	
	@RequestMapping("/message/{message}")
	public String getMessage(@PathVariable("message") String message) {
		topic.publish("Message received ->"+message);
		return "Message processed";
	}
	
}
