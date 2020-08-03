/**
 * 
 */
package com.test.freme.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.freme.spring.bean.Country;
import com.test.freme.spring.bean.GreetingService;
import com.test.freme.spring.bean.MyComponent;
import com.test.freme.spring.jdbc.CustomerDao;
import com.test.freme.spring.lang.Language;
import com.test.freme.spring.lang.impl.English;
import com.test.freme.spring.lang.impl.Vietnamese;

import lombok.extern.log4j.Log4j;

/**
 * @author bilonjea
 *
 */
@Log4j
public class AppSpringXMLMain {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {

		// Creating a Context Application object by reading
		// the configuration of the 'AppConfiguration' class.

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
	
		
		log.info("----------");
		Language language = (Language) context.getBean("language");

		log.info("Bean Language: "+ language);
		log.info("Call language.sayBye(): "+ language.getBye());

		log.info("----------");

		GreetingService service = (GreetingService) context.getBean("greetingService");


		service.sayGreeting();

		log.info("----------");

		MyComponent myComponent = (MyComponent) context.getBean("myComponent");

		myComponent.showAppInfo();
		
		
		log.info("----------English-----------");
		English en = (English) context.getBean("english");
		log.info(en.getBye());
		
		
		log.info("----------Vietnamese-------");
		Vietnamese viet = (Vietnamese) context.getBean("vietnamese");
		log.info(viet.getBye());
		
		
		log.info("----------Country---------");
		Country country = (Country) context.getBean("country");
		log.info(country.toString());
		
		log.info("----------CustomerDao-------");
		CustomerDao customer= (CustomerDao) context.getBean("customerDao");
		customer.createTable();

	}

}
