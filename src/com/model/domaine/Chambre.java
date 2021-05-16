package com.model.domaine;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Table;

@Table(name="chambre")
//@DiscriminatorValue
public class Chambre extends Hotel {
	private String typeChambre;
	private double prixChambre;
	private PrestationHebergement prestationHerbergement ;
    /**
     * Default constructor
     */
    public Chambre() {	
    }
    /**
     * Getter/Setter
     */
	public String getTypeChambre() {
		return typeChambre;
	}
	public void setTypeChambre(String typeChambre) {
		this.typeChambre = typeChambre;
	}
	public double getPrixChambre() {
		return prixChambre;
	}
	public void setPrixChambre(double prixChambre) {
		this.prixChambre = prixChambre;
	}
	public PrestationHebergement getPrestationHerbergement() {
		return prestationHerbergement;
	}
	public void setPrestationHerbergement(PrestationHebergement prestationHerbergement) {
		this.prestationHerbergement = prestationHerbergement;
	}


}