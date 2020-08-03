/**
 * 
 */
package com.test.freme;

<<<<<<< HEAD
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.freme.dao.MySQLAccess;
import com.test.freme.model.Individu;
import com.test.freme.model.Person;
import com.test.freme.spring.config.AppConfiguration;
=======
import org.apache.log4j.Logger;

import com.test.freme.model.Individu;
import com.test.freme.model.Person;
>>>>>>> 589b934480a2baf7f9798710994a6e08d8164b77

import lombok.extern.log4j.Log4j;

/**
<<<<<<< HEAD
 * @author bilonjea
 *
 */
@Log4j
public class AppMain {
	
=======
 * @author MacoMakrel
 *
 */

@Log4j
public class AppMain {
	//@Log4j à la place de  : private static final Logger log = Logger.getLogger(AppMain.class);
>>>>>>> 589b934480a2baf7f9798710994a6e08d8164b77

	/**
	 * @param args
	 */
	public static void main(String[] args) {
<<<<<<< HEAD
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		log.info("--------------BEANS Mysql ---------------");
		MySQLAccess m = (MySQLAccess) ctx.getBean("mysql");
		try {
			m.readDataBase();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.error(e);
		}

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
	
	
	
	private static void affichePerson() {
		
		log.debug("entree dans la methode main");

		log.info("Creation Person");
		Person p = new Person();
		p.setAdress("25 rue de la poste 77000");
		p.setAge(13);
		p.setNom("Durant");
		log.info("Persson: "+p.toString());
		
		log.info("Creation Individu");
		Individu individu = Individu.builder().build();
		individu.setAdress("25 rue de la poste 77000");
		individu.setAge(13);
		individu.setNom("Durant");
		log.info("Individu: "+individu.toString());
		
		log.info("Creation Individu2");
		Individu individu2 = Individu.builder()
				.nom("albert")
				.prenom("Fred")
				.age(13)
				.adress("25 rue d'alger liile")
				.build();
				
		log.info("Individu2: "+individu2.toString());
	}

=======

		log.info("Création d'une personne");
		Person p = new Person();
		p.setAdress("Meaux");
		p.setAge(24);
		p.setNom("Lud972vic");
		p.setPrenom("Eureka");
		log.info("L'objet Person " + p.toString());

		log.info("Création d'un individu");
		
		//on cree l'objet avec le builder ua lieu de new
		Individu individu = Individu.builder().build();
		individu.setAdress("Champs sur Marne");
		individu.setAge(52);
		individu.setNom("Tata");
		individu.setPrenom("Toto");
		log.info("L'objet Individu " + individu.toString());
		
		log.info("Création d'un individu2");
		//on parametre les attributs pour l'instance
		Individu individu2 = Individu
				.builder()
					.nom("toto")
					.age(45)
					.adress("paris")
					.prenom("tata")
				.build();
		log.info("L'objet Individu " + individu2.toString());
	}
>>>>>>> 589b934480a2baf7f9798710994a6e08d8164b77
}
