package services;

import java.util.Scanner;

import domaine.CB;
import domaine.Client;

public class GieCbService {
	private boolean cbAcceptee;
	private Client client;
	/**
	 * Constructor
	 */
	public GieCbService() {
	}
	
	/**
     * Verification
     */
	Scanner sc = new Scanner (System.in);
	System.out.println("Entrez votre mode de paiement: 1 pour CB, 2 pour autre");
	int mode= sc.nextInt();
	
	if (mode!=1) {
		System.out.println("Vous pouvez nous envoyer un chéque");
	}
	else {
		CB cb =new CB(sc.next(), sc.nextDouble(), sc.nextInt(), sc.next());
		sc.close();
		public boolean verifier( CB cb) {
				if (cb.valide == true) {
				//tester solde
				if (cb.getSolde()>=client.getMyReservation().getPrix());
				{
					return this.cbAcceptee=true ;
				}
				//payer
				}
				else {
				return this.cbAcceptee=false ;
				}
	
	}
		
    /**
     * @param CB
     */
    //public effectuePaiement() {
       
    

}