package com.model.domaine;

import java.util.*;

/**
 * 
 */
public class Voyage {
	private int numeroVoyage;
	private Boolean Statut;
	private double prix;
	private String pays;
	private String continent;
	public ArrayList<Prestation> listePrestations;
	private ArrayList<Reservation> listeReservation;   
	
	/**
     * Default constructor
     */
	public Voyage(int numeroVoyage, Boolean statut, double prix, String pays, String continent,ArrayList<Prestation> listePrestations,
			ArrayList<Reservation> listeReservation) {
		this.numeroVoyage = numeroVoyage;
		Statut = statut;
		this.prix = prix;
		this.pays = pays;
		this.continent = continent;
		this.listePrestations = listePrestations;
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


	public String getPays() {
		return pays;
	}


	public void setPays(String pays) {
		this.pays = pays;
	}


	public String getContinent() {
		return continent;
	}


	public void setContinent(String continent) {
		this.continent = continent;
	}


	public ArrayList<Prestation> getListePrestations() {
		return listePrestations;
	}


	public void setListePrestations(ArrayList<Prestation> listePrestations) {
		this.listePrestations = listePrestations;
	}

	
}