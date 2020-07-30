package com.test.freme.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

//@Builder générer les méthodes de tous les attributs
//@Data -> set, get, methode
//@Setter
//Getter
/*
 * @Data de lombok, permet d'éviter de faire des getter et des setters et la
 * méthode toString
 */
public class Individu {
	
	
	
	private String nom;
	private String prenom;
	private int age;
	private String adress;

}
