package com.test.freme;

import org.apache.log4j.Logger;

import com.test.freme.model.Individu;
import com.test.freme.model.Person;

// @author bilonjea
public class AppMain {

	private static final Logger log = Logger.getLogger(AppMain.class);

	//@param args

	public static void main(String[] args) {
		//log.info("Entrée de la méthode main");
		log.debug("Entree dans la méthode main");

		log.info("Création Personne");
		Person p = new Person();
		p.setAdress("19 Rue Rochebrune 93100");
		p.setAge(18);
		p.setNom("Aferyat");
		p.setPrenom("Aharone");
		System.out.println(p.toString());
		log.info("Person"+p.toString());

		log.info("Création Individu");
		Individu individu = Individu.builder().build();
		individu.setAdress("19 Rue Rochebrune1 93100");
		individu.setAge(19);
		individu.setNom("Aferyat1");
		individu.setPrenom("Aharone1");
		System.out.println(individu.toString());
		log.info("Individu"+individu.toString());

		log.info("Création Individu2");
		Individu individu2 = Individu.builder()
				.nom("Aferyat2")
				.prenom("Aharone2")
				.age(20)
				.adress("19 Rue Rochebrune2 93100")
				.build();
		log.info("Individu2: "+ individu2.toString());

	}

}
