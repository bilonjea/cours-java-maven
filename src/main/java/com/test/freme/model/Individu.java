package com.test.freme.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Individu {
	private String nom;
	private String prenom;
	private String adresse;
	private int age;
	
}