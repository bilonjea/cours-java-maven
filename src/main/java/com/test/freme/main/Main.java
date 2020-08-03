/**
 * 
 */
package com.test.freme.main;

import org.apache.log4j.Logger;

import com.test.freme.bdd.mysql.MySQLAccess;
import com.test.freme.pojo.Individu;
import com.test.freme.pojo.Person;

import lombok.extern.log4j.Log4j;



/**
 * @author bilonjea
 *
 */
@Log4j
public class Main {

	///private static final Logger log = Logger.getLogger(Main.class);

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
        
		creationIndividu();
		creationPersone();

		//lancerMysql();


	}

	
	private static void creationIndividu() {
		Individu person = new Individu();
		person.setAdress("25 rue de la poste 77000");
		person.setAge(13);
		person.setNom("Durant");

		log.info(person);

	}


	private static void creationPersone() {
		Person person = new Person();
		person.setAdress("25 rue de la poste 77000");
		person.setAge(13);
		person.setNom("Durant");

		log.info(person);

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

}
