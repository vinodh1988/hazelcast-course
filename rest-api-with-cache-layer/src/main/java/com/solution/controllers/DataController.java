package com.solution.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solution.services.DataService;

@RestController
@RequestMapping("/api")
public class DataController {
@Autowired
  DataService service;
@RequestMapping("/messages/{id}")
	public String getMessage(@PathVariable("id") Integer id) {
		return service.cachedCall(id);
	}
}
