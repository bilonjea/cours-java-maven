/**
 * 
 */
package com.test.freme;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.freme.dao.MySQLAccess;
import com.test.freme.spring.config.AppConfiguration;
import com.test.freme.spring.lang.Language;
import com.test.freme.spring.lang.impl.English;
import com.test.freme.spring.lang.impl.Vietnamese;

import lombok.extern.log4j.Log4j;

@Log4j
public class AppSpringAnnotationMain {
	/******* METHODS *******/
	public static void main(String[] args) {
		
		log.info("----------BEANS----------");
		
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfiguration.class);
		log.info("----------BEAN ENGLISH----------");
		English en = (English) ctx.getBean("english");
		
		log.info("Bye = "+ en.getBye());
		log.info("Hello = "+en.getGreeting());
		
		log.info("----------BEAN VIET----------");
		Vietnamese vn = (Vietnamese) ctx.getBean("vietnamese");
		
		log.info("Bye =  "+ vn.getBye());
		log.info("Hello = "+ vn.getGreeting());
		
		log.info("----------BEAN LANGUAGE----------");
		Language lg = (Language) ctx.getBean("language");
		log.info("Bye =  "+ lg.getBye());
		log.info("Hello = "+ lg.getGreeting());
		
		log.info("----------BEAN MYSQL----------");
		MySQLAccess mysql = (MySQLAccess) ctx.getBean("mysql");
		try {
			mysql.readDataBase();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.error(e);
		}
		
		log.info("----------BEANS----------");
	}

}
