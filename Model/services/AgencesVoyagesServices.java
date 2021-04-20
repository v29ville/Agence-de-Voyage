package services;

import java.util.ArrayList;

import domaine.Voyage;

public class AgencesVoyagesServices {
	private ArrayList<Voyage> offres;
    /**
     * Default constructor
     */
    public AgencesVoyagesServices(ArrayList<Voyage> offres) {
		this.offres = offres;
	}
	/**
     * Getter/Setter
     */
	public ArrayList<Voyage> getOffres() {
		return offres;
	}
	public void setOffres(ArrayList<Voyage> offres) {
		this.offres = offres;
	}
	/**
     * @param Voyage 
     * @return
     */
   /* public boolean reserver(void Voyage) {
        // TODO implement here voir réservation
        return false;
    }*/

  

}