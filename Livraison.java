package com.ennassiry.controle;

public class Livraison {
	private double distance;
	Livreur livreur;
	Commande commande;
	public Livraison(double distance, Livreur livreur, Commande commande) {
		super();
		this.distance = distance;
		this.livreur = livreur;
		this.commande = commande;
	}
	
	public double calculerMontant() {
		return livreur.calculerFrais(distance);
	}
//String identifiant, String nom, double tarifKm
	public void afficherRecapitulatif() {
		System.out.println(" # distance :"+this.distance+"livreur "+livreur.nom+" identifiant "+livreur.identifiant+" tarifKm " + livreur.tarifKm +"commande : Numero "+commande.getNumero()+"Designation"+commande.getDestination());
	}
}
