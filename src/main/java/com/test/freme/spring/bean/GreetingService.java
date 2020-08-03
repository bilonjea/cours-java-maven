/**
 * 
 */
package com.test.freme.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.freme.spring.lang.Language;
<<<<<<< HEAD
=======
import com.test.freme.spring.lang.impl.Vietnamese;
>>>>>>> develop

/**
 * @author bilonjea
 *
 */
@Service
public class GreetingService {
	
<<<<<<< HEAD
	@Autowired
	private  Language language;
	
	public GreetingService() {
		 
=======
	   @Autowired
	   private Language language;
	 
	   public GreetingService() {
	 
>>>>>>> develop
	   }
	 
	   public void sayGreeting() {
	        
	       String greeting = language.getGreeting();
	 
	       System.out.println("Greeting: " + greeting);
	   }
<<<<<<< HEAD
=======
	 
>>>>>>> develop

}
