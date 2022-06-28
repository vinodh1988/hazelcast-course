package com.solution.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solution.services.TopicService;

@RestController
@RequestMapping("/api")
public class RestAPI {
  @Autowired
  TopicService service;
	@RequestMapping("/messages")
    public List<String> readMessages(){
		return  service.getMessages();
	}
}
