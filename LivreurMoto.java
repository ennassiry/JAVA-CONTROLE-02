package com.ennassiry.controle;

public class LivreurMoto extends Livreur {
	private int anciennete ;

	public LivreurMoto(String identifiant, String nom, double tarifKm, int anciennete) {
		super(identifiant, nom, tarifKm);
		this.anciennete = anciennete;
	}

	@Override
	public double calculerFrais(double distance) {
		if(anciennete  < 3) {
			return distance * tarifKm;
		}
		return distance * (tarifKm+2);
		
	}
	
	

}
