/**
 * 
 */
package com.test.freme.spring.lang.impl;

import org.springframework.stereotype.Component;

import com.test.freme.spring.lang.Language;

/**
 * @author bilonjea
 *
 */
@Component
public class Vietnamese implements Language {

	@Override
	public String getGreeting() {
		return "Xin Chao";
	}

	@Override
	public String getBye() {
		return "Tam Biet";
	}

}
