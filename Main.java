package com.ennassiry.controle;

public class Main {
	public static void main(String[] args) {

		// public LivreurMoto(String identifiant, String nom, double tarifKm, int
		// anciennete) {

		Livreur m1 = new LivreurMoto("A-8788", "EN-NASSIRY", 10, 4);
		Livreur m2 = new LivreurMoto("L-8788", "FRINA", 8, 2);
		// public LivreurCamion(String identifiant, String nom, double tarifKm, double
		// tauxMajoration) {
		Livreur c1 = new LivreurCamion("B9898", "SAFI", 15, 0.20);
		Livreur c2 = new LivreurCamion("V9898", "KARIM", 12, 0.10);

		Livreur[] livreurs = { m1, m2, c1, c2 };
		// public Commande(String numero, String destination) {
		Commande com1 = new Commande("1", "Produit 1");
		Commande com2 = new Commande("2", "Produit 2");
		m2.setResponsable(m1);
		c1.setResponsable(m1);
		c2.setResponsable(c1);
   System.out.println(" les informations de tous les livreurs et, lorsqu'il existe, le nom de leur responsable");
		for (Livreur e : livreurs) {
			if (e.responsable != null) {
				e.afficherDetails();
			}
		}
		System.out.println("---------------------------------------");
		System.out.println("le récapitulatif de toutes les livraisons");
//	public Livraison(double distance, Livreur livreur, Commande commande) {
		Livraison l1 = new Livraison(30, m1, com1);
		Livraison l2 = new Livraison(20, m2, com2);

		Livraison l3 = new Livraison(40, c1, com1);
		Livraison l4 = new Livraison(50, c1, com2);

		Livraison[] livraisons = { l1, l2, l3, l4 };
		double somme = 0;
		int n = 0;
		for (Livraison v : livraisons) {
			v.afficherRecapitulatif();
			somme += v.calculerMontant();

		}
		System.out.println("---------------------------------------");
		System.out.println("le montant total des livraisons: " + somme);
		for (Livreur e : livreurs) {
			if (e.responsable != null) {
				if (e.getResponsable() == m1) {
					n++;
				}
			}

		}
		System.out.println("---------------------------------------");
		System.out.print("le nombre de livreurs directement supervisés par le premier livreur à moto :");
		System.out.println(n);
	}
}