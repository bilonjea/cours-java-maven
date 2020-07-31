package com.test.freme.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.freme.spring.lang.Language;

@Service
public class GreetingService {
	/******* VARIABLES *******/

	@Autowired
	private Language language;
	
	
	/******* METHODS *******/
	public void sayGreeting() {
		String greeting = language.getGreeting();
		System.out.println("Greeting: " + greeting);
	}
	
}
