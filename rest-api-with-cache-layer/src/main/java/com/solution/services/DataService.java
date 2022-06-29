package com.solution.services;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class DataService {
    
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
