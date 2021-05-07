package com.model.domaine;

import java.util.Scanner;

public class Assurance {
	private double prix;
	private Contrat contrat;
	private Reservation myReservation;
    /**
     * Default constructor
     */
	public Assurance(double prix, Contrat contrat, Reservation myReservation) {
		super();
		this.prix = prix;
		this.contrat = contrat;
		this.myReservation = myReservation;
	}
    /**
     * Getter/Setter
     */
	public double getPrix() {
		return prix;
	}
	
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Contrat getContrat() {
		return contrat;
	}
	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}
	public Reservation getMyReservation() {
		return myReservation;
	}
	public void setMyReservation(Reservation myReservation) {
		this.myReservation = myReservation;
	}
	 /**
     * Add insurance
     */
	public void addInsurance () {Scanner sc= new Scanner(System.in);
	System.out.println("Souhaitez-vous une assurance? oui/non");
	String assurrance= sc.next();
	while (assurrance != "oui" && assurrance !="non") {
		System.out.println("Réponse non valide");
	}
	if (assurrance.equals("non")) {
		System.out.println("Vous voyagerez sans assurance.");
		this.prix=0;
	}
	else if (assurrance.equals("oui")) {
		System.out.println("Entrez type d'assurance: 1 pour annulation, 2 pour autre");
		int typeAssurance = sc.nextInt();
		if (typeAssurance ==1) {
			Contrat contrat= new Contrat();
			AssuranceAnnulation myAssurance= new AssuranceAnnulation(this.getPrix(), contrat, myReservation);
			}
		else{
			System.out.println("Ce service n'est pas proposé");
		}
		}
		sc.close();	
	}
}