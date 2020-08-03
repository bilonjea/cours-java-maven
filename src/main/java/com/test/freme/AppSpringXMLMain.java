/**
 * 
 */
package com.test.freme;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.freme.dao.MySQLAccess;
import com.test.freme.spring.bean.Country;
import com.test.freme.spring.bean.GreetingService;
import com.test.freme.spring.bean.MyRepository;
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
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		
		
		log.info("--------------BEANS Country ---------------");

		Country country= (Country) ctx.getBean("country");
		System.out.println(country);
		
		log.info("--------------BEANS---------------");

	}

}
