package com.solution.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.solution.entities.Person;
import com.solution.repositories.PeopleRepository;

@Service
public class DataService {
	
	@Autowired
	PeopleRepository people;
    
	String []messages= {
			"World is too big",
			"Known is a Drop",
			"Java is OOP language",
			"Python is a multipurpose language",
			"English is a language"
	};
	
	@Cacheable("messages")
	public String cachedCall(int messageid) {
		return getData(messageid);
	}
	@Cacheable("people")
	public Person getPerson(int sno) {
		System.out.println("#####PROCESSSSING####");
		return people.findBySno(sno);
	}
	
	public List<Person> getPeople(){
		return people.findAll();
	}
	public String getData(int messageid) {
		try {
			Thread.sleep(5000);
			return messages[messageid];
		}
		catch(InterruptedException e) {
			e.printStackTrace();
			return null;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			return "NO DATA FOUND";
		}
		
	}
}
