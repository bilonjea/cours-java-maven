package com.test.freme;

import org.apache.log4j.Logger;

import com.test.freme.dao.MySQLAccess;
import com.test.freme.model.Individu;
import com.test.freme.model.Person;

/* @author Tuan */
public class AppMain {
 private static final Logger log = Logger.getLogger(AppMain.class);
    /* 
     * @param args
     */
    public static void main(String[] args) {
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
        // TODO Auto-generated method stub
    	private static void affichePerson() {
    		
    	
    	log.debug("entree dans la methode main");
    	log.info("creation Person");
        Person p = new Person() ;
        p.setAdress("25 rue de la poste 77000");
        p.setAge(13);
        p.setNom("Durant");
     //   System.out.println(p.toString());
    	log.info("Persson : " + p.toString());
    	
    	log.info("creation individu");
    	   Individu i = Individu.builder().build() ;
    	   i.setAdress("25 rue de la poste 77000");
           i.setAge(13);
           i.setNom("Durant");
           log.info("individu : " + i.toString());
           
           log.info("creation individu 2");
           Individu i2 = Individu.builder()
        		   .nom("Albert")
        		   .prenom("Fred")
        		   .age(13)
        		   .adress("24 rue")
        		   .build();
        		   log.info("individi2 : "+i2.toString());
        		   
        		   System.out.println("tutu");
    }
}