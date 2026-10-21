package com.ennassiry.controle;

public class Commande {

	private String numero;
	private String destination;

	public Commande(String numero, String destination) {
		
		this.numero = numero;
		this.destination = destination;
	}

	
	public String getDestination() {
		return destination;
	}
	
	public String getNumero() {
		return numero;
	}


	

	@Override
	public String toString() {
		return "Commande [numero=" + numero + ", destination=" + destination + "]";
	}

}
