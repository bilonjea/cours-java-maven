package com.test.freme.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author bilonjea
 *
 */

@Data
@Builder
public class Individu {
	
	private String nom;
	private String prenom;
	private int age;
	private String adress;
	
}
