package com.model.services;

import java.util.ArrayList;

import com.model.domaine.Voyage;

public class AgencesVoyagesServices {
	private ArrayList<Voyage> offres;
	private String nom;
	
    /**
     * Constructor
     */
    public AgencesVoyagesServices(String nom, ArrayList<Voyage> offres) {
    	this.nom=nom;
    	this.offres = offres;
	}
    public AgencesVoyagesServices() {}
	/**
     * Getter/Setter
     */
	public ArrayList<Voyage> getOffres() {
		return offres;
	}
	public void setOffres(ArrayList<Voyage> offres) {
		this.offres = offres;
	}
	  
		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

	/**
     * @param Voyage 
     * @return
     */
    public boolean reserver(Voyage voyage) {
        // TODO implement here voir réservation
        return true;
    }

  

}