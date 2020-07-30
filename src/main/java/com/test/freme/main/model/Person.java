package com.test.freme.main.model;

public class Person {
private String nom, prenom, adress;
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
