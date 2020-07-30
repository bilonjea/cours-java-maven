package com.test.freme;
import org.apache.log4j.Logger;

import com.test.freme.dao.MySQLAccess;
import com.test.freme.model.*;


public class AppMain {
	
	private static final Logger log = Logger.getLogger(AppMain.class);

	public static void main(String[] args) {
		lancerMySQL();
	}
	
	private static void lancerMySQL() {
		log.info("MySQL");
		
		try {
			MySQLAccess dao = new MySQLAccess();
			dao.readDataBase();
		} catch (Exception e){
			log.error(e);
		}
	}
	
	public static void affichePersons() {
		log.info("entée dans la méthode main");
		
		log.info("creation Person");
		Person p = new Person("Person", "Jean", "chez lui", 8);
		System.out.println(p.toString());
		log.info("personne"+p.toString());
		
		log.info("creation Individu");
		Individu i = new Individu("Individu", "Jean", "là bas", 47);
		System.out.println(i.toString());
		log.info("individu"+i.toString());
		
		log.info("creation Individu 2");
		Individu i2 = Individu.builder().nom("Individu2")
										.prenom("Jean")
										.adress("vers la gauche")
										.age(28).build();
		System.out.println(i2.toString());
		log.info("individu"+i2.toString());
	}
}
