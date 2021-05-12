package com.model.services;

import java.util.Scanner;

import com.model.domaine.CB;
import com.model.domaine.Client;

public class GieCbService {
	private boolean cbValide;
	private boolean cbAcceptee;
	private Client client;
	private String datedujour;
	private CB cb;
	private int modePaiement;
	/**
	 * Constructor
	 */
	public GieCbService() {
	}

	/**
	 * how to pay
	 */
	public void choixMoyenPaiement() {
		System.out.println("Entrez votre mode de paiement: 1 pour CB, 2 pour autre");
		Scanner sc = new Scanner (System.in);	
		modePaiement= sc.nextInt();
		sc.close();

		if (modePaiement!=1) {
			System.out.println("Vous pouvez nous envoyer un chéque");
		}
		else {
			System.out.println("Entrez information de la carte de crédit");
		}
	}
	/**
	 * test cb validity
	 */	
	public boolean cbValide() {

		if (datedujour.compareTo(cb.getDateExpiration())<0) {
			return this.cbValide=true ;	}
		else {
			System.out.println("Votre carte bancaire n'est pas valide.");
			return this.cbValide=false;
			}
	}

public boolean soldeSuffisant() {

if (cb.valide == true) {
	//edit with arraylist loop
	//if (cb.getSolde()>=client.getMyReservation().getPrixTotal());
	{
		return this.cbAcceptee=true ;
	}
}
else {
	return this.cbAcceptee=false ;
}

}
}

/**
 * @param CB
 */
//public effectuePaiement() {



