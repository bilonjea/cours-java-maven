package com.test.freme;

import org.apache.log4j.Logger;

import com.sun.tools.javac.Main;
import com.test.freme.dao.MySQLAccess;
import com.test.freme.model.Individu;
import com.test.freme.model.Person;

import lombok.Builder;
import lombok.extern.log4j.Log4j;

@Log4j
public class AppMain {
	
	//private static final Logger log = Logger.getLogger(AppMain.class);//gerer les bugs et les afficher suivant la class

	public static void main (String[] args) {
		lancerMysql();
	}
	
	
	private static void lancerMysql() {
		log.info("Mysql");
		
		try {
			MySQLAccess dao = new MySQLAccess();
			dao.readDataBase();
		} catch (Exception e) {
			log.error(e);
		}
	}
	public static void afficherPerson() {
		
		log.info("entree dans la methode main"); 
		
		log.info("Creation Person");
		Person p = new Person();
		
		p.setAdress("25,bvd allemane 95100");
		p.setAge(20);
		p.setNom("DUARNT");
		
		log.info("Creation Individu");
		
		Individu i = Individu.builder().build();
		i.setAdress("25,bvd allemane 95100");
		i.setAge(20);
		i.setNom("DUARNT");
		log.info("Individu"+i.toString());
		
		log.info("Creation Individu2");
		Individu i2 = Individu.builder().nom("toto")
				.prenom("fred")
				.age(13)
				.adress("46 rue de la federation, 75015")
				.build();
		log.info("Individu2"+i2.toString());
		
     System.out.println(p.toString());
     
     log.debug("Person"+p.toString());
	}

}
