package com.test.freme.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data @AllArgsConstructor @Builder public class Individu {
		private String nom;
		private String prenom;
		private String adress;
		private int age;
}
