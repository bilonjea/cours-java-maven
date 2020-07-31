package com.test.freme.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;	

@Data
@Builder
@AllArgsConstructor
public class Individu {

	private String nom;
	private String prenom;
	private int age;
	private String adress;
}