package com.model.domaine;

import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Assurance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long assuranceID;
	
	private String typeAssurance;
	private double prixAssurance;
	private String contratAssurance;
	private boolean assuranceSouscrite;
	
	@OneToOne(mappedBy="myAssurance")
	private Reservation myReservation;
    /**
     *  constructor
     */
    public Assurance(boolean assuranceSouscrite) {
		super();
		this.assuranceSouscrite = assuranceSouscrite;
	}

	public Assurance(String typeAssurance, double prixAssurance, String contratAssurance) {
		super();
		this.typeAssurance = typeAssurance;
		this.prixAssurance = prixAssurance;
		this.contratAssurance = contratAssurance;
	}

	/**
     * Getter/Setter
     */

	 public String getTypeAssurance() {
		return typeAssurance;
	}

	public void setTypeAssurance(String typeAssurance) {
		this.typeAssurance = typeAssurance;
	}

	public double getPrixAssurance() {
		return prixAssurance;
	}

	public void setPrixAssurance(double prixAssurance) {
		this.prixAssurance = prixAssurance;
	}

	public String getContratAssurance() {
		return contratAssurance;
	}

	public void setContratAssurance(String contratAssurance) {
		this.contratAssurance = contratAssurance;
	}

	public boolean isAssuranceSouscrite() {
		return assuranceSouscrite;
	}

	public void setAssuranceSouscrite(boolean assuranceSouscrite) {
		this.assuranceSouscrite = assuranceSouscrite;
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
		this.assuranceSouscrite=false;
		this.prixAssurance=0;
	}
	else if (assurrance.equals("oui")) {
		System.out.println("Entrez type d'assurance: 1 pour annulation, 2 pour autre");
		int typeAssurance = sc.nextInt();
		if (typeAssurance ==1) {
			this.assuranceSouscrite=true;
			}
		else{
			System.out.println("Ce service n'est pas proposé");
		}
		}
		sc.close();	
	}
}