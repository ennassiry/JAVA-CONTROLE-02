package com.ennassiry.controle;

public abstract class Livreur {
	
	protected String identifiant ;
	protected String nom ;
	protected double tarifKm ;
	protected Livreur responsable;
	public Livreur(String identifiant, String nom, double tarifKm) {
	
		this.identifiant = identifiant;
		this.nom = nom;
		this.tarifKm = tarifKm;
		this.responsable = null;
	}
	
	public String getIdentifiant() {
		return this.identifiant;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public abstract double calculerFrais(double distance) ;

	
	public void afficherDetails() {
		System.out.println("Livreur [identifiant=" + identifiant + ", nom=" + nom + ", tarifKm=" + tarifKm + "]");
	}
	
	public void setResponsable(Livreur responsable) {
		this.responsable=responsable;
		if(responsable == this) {
			System.out.println("le livreur se désigne lui-même comme responsable.");
		}
	}
	
	public Livreur getResponsable() {
		
		return this.responsable;
	}
	
	

}
