/**
 * 
 */
package com.test.freme;

import org.apache.log4j.Logger;

import com.test.freme.dao.MYSQLAccess;
import com.test.freme.model.Person;

import lombok.extern.log4j.Log4j;

/**
 * @author 77011-53-06
 *
 */

public class AppMain {
	
	private static final Logger log = Logger.getLogger(AppMain.class);
	

	/**
	 * @param args
	 */

	private static void lancerMysql() {
		log.info("Mysql");
		
		try {
			MYSQLAccess dao = new MYSQLAccess();
			dao.readDataBase();
		}catch (Exception e) {
			log.error(e);
		}
	}
	
	private static void afficherPersonne() {
log.info("entree dans la methode main");
		
		//Person
		log.info("Creation de person");
		
		Person p =  new Person();
		
		p.setAdress("20 rue de la liberté 75000");
		p.setAge(13);
		p.setNom("Durant");
		
		System.out.println(p.toString());
		
		log.info("Person"+p.toString());
		
		
		//Individu 
		log.info("creation de individu");
		Individu individu =  Individu.builder().build();
		
		individu.setAdress("20 rue de la liberté 2000");
		individu.setAge(13);
		individu.setNom("Durant");
		log.info("Individu"+individu.toString());
		
		log.info("Creation individu 2");
		Individu individu2 = Individu.builder()
				.nom("albert")
				.prenom("Fred")
				.age(13)
				.adress("20 rue de la casscade 75000")
				.build();
		log.info("Individu"+individu2.toString());
	}
	public static void main(String[] args) {
		
		lancerMysql();
	}

}
