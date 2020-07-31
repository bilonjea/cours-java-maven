package com.test.freme.spring.lang.impl;

import com.test.freme.spring.lang.Language;

/**
 * @author bilonjea
 *
 */
//@Component
public class English implements Language {

	@Override
	public String getGreeting() {
		return "Hello";
	}

	@Override
	public String getBye() {
		return "Bye bye";
	}

}