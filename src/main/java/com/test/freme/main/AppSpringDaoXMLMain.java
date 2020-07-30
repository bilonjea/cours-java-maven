/**
 * 
 */
package com.test.freme.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.freme.spring.bean.Country;
import com.test.freme.spring.bean.GreetingService;
import com.test.freme.spring.bean.MyComponent;
import com.test.freme.spring.lang.Language;
import com.test.freme.spring.lang.impl.English;
import com.test.freme.spring.lang.impl.Vietnamese;

import lombok.extern.log4j.Log4j;

/**
 * @author bilonjea
 *
 */
@Log4j
public class AppSpringDaoXMLMain {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {

		// Creating a Context Application object by reading
		// the configuration of the 'AppConfiguration' class.

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationDaoContext.xml");
		


	}

}
