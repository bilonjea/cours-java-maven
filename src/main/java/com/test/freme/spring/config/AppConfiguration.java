package com.test.freme.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.test.freme.dao.MySQLAccess;
import com.test.freme.spring.lang.Language;
import com.test.freme.spring.lang.impl.Vietnamese;

@Configuration
@ComponentScan({"com.test.freme.spring"})
public class AppConfiguration {
	/******* METHODS *******/
	@Bean(name= "language")
	public Language getLanguage() {
		
		return new Vietnamese();
	}
	
	@Bean(name="mysql")
	public MySQLAccess getMySQLKAccess() {
		
		return new MySQLAccess();
	}
	
	
	
}
