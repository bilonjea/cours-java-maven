package com.test.freme.main.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Individu {
	private String nom, prenom, adress;
	private int age;

}
