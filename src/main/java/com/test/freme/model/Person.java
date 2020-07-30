package com.test.freme.model;

public class Person {
	
	private String nom;
	private String prenom;
	private String adresse;
	private int age;
	
	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getAdresse() {
		return adresse;
	}



	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	



	@Override
	public String toString() {
		return "Person [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", adresse=" + adresse + "]";
	}



	public Person() {
		// TODO Auto-generated constructor stub
	}

}
