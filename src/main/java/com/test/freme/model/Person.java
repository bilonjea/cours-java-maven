package com.test.freme.model;

public class Person {
    private String nom;
    private String prenom;
    private int age;
    private String adress;
    
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
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    @Override
    public String toString() {
        return "Person [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", adress=" + adress + ", getNom()="
                + getNom() + ", getPrenom()=" + getPrenom() + ", getAge()=" + getAge() + ", getAdress()=" + getAdress()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }



}