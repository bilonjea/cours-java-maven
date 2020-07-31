package com.test.freme.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.test.freme.dao.MySQLAccess;
import com.test.freme.spring.lang.Language;
import com.test.freme.spring.lang.impl.Vietnamese;

@Configuration
@ComponentScan({"com.test.freme.spring"})
@Component
@Service
@Repository
@Controller
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
