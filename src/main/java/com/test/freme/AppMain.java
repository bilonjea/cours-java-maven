package com.test.freme;
// JUSTE POUR UN TEST GITHUB

import org.apache.log4j.Logger;

import com.test.freme.model.Individu;
import com.test.freme.model.Person;

import lombok.Builder;
import lombok.extern.java.Log;


@Log

public class AppMain {
	private static final Logger log = Logger.getLogger(AppMain.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			log.info("entree dans la méthode main");
		
			log.info("creation Individu");
			Person p = new Person();
			
			System.out.println(p.toString());
			
			log.info("creation personne");
			Individu individu = Individu.builder().build();
			p.setAdresse("25 rue de la poste");
			p.setAge(13);
			p.setNom("Durant");
			log.info("Individu: " + individu.toString());
			
			log.info("creation Individu2");
			Individu individu2 = Individu.builder()
					.nom("Albert")
					.prenom("Fred")
					.age(13)
					.adresse("12 ru e des rossignols")
					.build();
			log.info("Individu2: " + individu2.toString());
			
			log.info("Individu2: " + individu2.toString());
			log.info("Individu2: " + individu2.toString());


	}

}
