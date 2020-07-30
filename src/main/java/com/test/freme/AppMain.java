/**
 * 
 */
package com.test.freme;

import org.apache.log4j.Logger;

import com.test.freme.model.Individu;
import com.test.freme.model.Person;

import lombok.extern.log4j.Log4j;

/**
 * @author MacoMakrel
 *
 */

@Log4j
public class AppMain {
	//@Log4j à la place de  : private static final Logger log = Logger.getLogger(AppMain.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

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
}
