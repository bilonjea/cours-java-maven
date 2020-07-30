package com.test.freme.model;

public class Person {

	private String nom;
	private String prenom;
	private String adress;
	private int age;
	
	public Person(String nom, String prenom, String adress, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adress = adress;
		this.age = age;
	}
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
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [nom=" + nom + ", prenom=" + prenom + ", adress=" + adress + ", age=" + age + "]";
	}
}
