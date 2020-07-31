package com.test.freme.spring.lang.impl;

import org.springframework.stereotype.Component;

import com.test.freme.spring.lang.Language;

@Component
public class Vietnamese implements Language {
	/******* METHODS *******/
	@Override
	public String getGreeting() {
		// TODO Auto-generated method stub
		return "Xin Chao";
	}

	@Override
	public String getBye() {
		// TODO Auto-generated method stub
		return "Tam Biet";
	}

}
