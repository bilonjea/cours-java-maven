/**
 * 
 */
package com.test.freme.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.freme.spring.lang.Language;
import com.test.freme.spring.lang.impl.Vietnamese;

/**
 * @author bilonjea
 *
 */
@Service
public class GreetingService {
	
	   @Autowired
	   private Language language;
	 
	   public GreetingService() {
	 
	   }
	 
	   public void sayGreeting() {
	        
	       String greeting = language.getGreeting();
	 
	       System.out.println("Greeting: " + greeting);
	   }
	 

}
