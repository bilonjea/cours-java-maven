package com.test.freme;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Individu {

	private String nom;
	private String prenom;
	private int age;
	private String adress;

	
}
