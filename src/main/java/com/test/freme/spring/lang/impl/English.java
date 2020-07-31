package com.test.freme.spring.lang.impl;

import org.springframework.stereotype.Component;

import com.test.freme.spring.lang.Language;

@Component
public class English implements Language {
	/******* METHODS *******/
	@Override
	public String getGreeting() {
		// TODO Auto-generated method stub
		return "Hello";
	}

	@Override
	public String getBye() {
		// TODO Auto-generated method stub
		return "Bye";
	}

}
