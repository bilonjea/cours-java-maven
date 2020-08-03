/**
 * 
 */
package com.test.freme;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.freme.dao.MySQLAccess;
import com.test.freme.spring.bean.GreetingService;
import com.test.freme.spring.bean.MyRepository;
import com.test.freme.spring.config.AppConfiguration;
import com.test.freme.spring.lang.Language;
import com.test.freme.spring.lang.impl.English;
import com.test.freme.spring.lang.impl.Vietnamese;

import lombok.extern.log4j.Log4j;

/**
 * @author bilonjea
 *
 */
@Log4j
public class AppSpringAnnotationMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		log.info("--------------BEANS---------------");
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		log.info("--------------BEANS English ---------------");
		English en = (English) ctx.getBean("english");
		log.info("Bye "+ en.getBye());
		log.info("Greet "+ en.getGreeting());
		
		
		log.info("--------------BEANS Vietnamese ---------------");
		Vietnamese viet = (Vietnamese) ctx.getBean("vietnamese");
		log.info("Bye "+ viet.getBye());
		log.info("Greet "+ viet.getGreeting());
		
		
		log.info("--------------BEANS Language ---------------");
		Language lg= (Language) ctx.getBean("language");
		log.info("Bye "+ lg.getBye());
		log.info("Greet "+ lg.getGreeting());
		
		
		
		log.info("--------------BEANS Mysql ---------------");
		MySQLAccess m = (MySQLAccess) ctx.getBean("mysql");
		try {
			m.readDataBase();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.error(e);
		}
		
		
		log.info("--------------BEANS GreetingService ---------------");
		GreetingService service= (GreetingService) ctx.getBean("greetingService");
		service.sayGreeting();
		
		log.info("--------------BEANS MyRepository ---------------");
		MyRepository repos= (MyRepository) ctx.getBean("myRepository");
		System.out.println(repos.getSystemDateTime());
		System.out.println(repos.getAppName());
		
		log.info("--------------BEANS---------------");
		
		
		

	}

}
