package com.test.freme.main;

import org.apache.log4j.Logger;

import com.test.freme.main.model.Individu;
import com.test.freme.main.model.Person;

import lombok.extern.java.Log;

@Log
public class AppMain {
    //private static final Logger log = Logger.getLogger(AppMain.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.info("creation Person");
		Person p = new Person();

p.setAdress("25 rue de la poste 77000");
p.setAge(13);
p.setNom("durant");
Individu i = Individu.builder().build();


Individu i2 = Individu.builder()
.nom("toto")
.prenom("tata")
.age(12)
.adress("test")
.build();


log.info("creation Individu");
i.setAdress("25 rue de la poste 77000");
i.setAge(13);
i.setNom("durant");
log.info("Affichage");
System.out.println(p.toString());
System.out.println(i.toString());
System.out.println(i2.toString());
log.info("Person"+p.toString());
	}

}
