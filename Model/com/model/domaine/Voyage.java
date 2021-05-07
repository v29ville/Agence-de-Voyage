package com.model.domaine;

import java.util.*;

/**
 * 
 */
public class Voyage extends Destination {
	private int numeroVoyage;
	private Boolean Statut;
	private double prix;
	private Formule myFormule;
	private Destination destination;
	private ArrayList<Reservation> listeReservation;    
	/**
     * Default constructor
     */
	public Voyage(int numeroVoyage, Boolean statut, double prix, Formule myFormule, Destination destination,
			ArrayList<Reservation> listeReservation) {
		super();
		this.numeroVoyage = numeroVoyage;
		Statut = statut;
		this.prix = prix;
		this.myFormule = myFormule;
		this.destination = destination;
		this.listeReservation = listeReservation;
	}
    /**
     * Getter/Setter
     */
    public int getNumeroVoyage() {
		return numeroVoyage;
	}





	public void setNumeroVoyage(int numeroVoyage) {
		this.numeroVoyage = numeroVoyage;
	}


	public Boolean getStatut() {
		return Statut;
	}


	public void setStatut(Boolean statut) {
		Statut = statut;
	}


	public Formule getMyFormule() {
		return myFormule;
	}


	public void setMyFormule(Formule myFormule) {
		this.myFormule = myFormule;
	}


	public Destination getDestination() {
		return destination;
	}


	public void setDestination(Destination destination) {
		this.destination = destination;
	}


	public ArrayList<Reservation> getListeReservation() {
		return listeReservation;
	}


	public void setListeReservation(ArrayList<Reservation> listeReservation) {
		this.listeReservation = listeReservation;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	public double getPrix() {
        return prix;
    }

}