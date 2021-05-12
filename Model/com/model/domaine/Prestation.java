package com.model.domaine;

import java.time.LocalDate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Table(name="prestation")
@Inheritance
//@DiscriminatorColumn
public abstract class Prestation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long refPrestation;
	
	private LocalDate dateDepart;
	private LocalDate dateArrivee;
	private double prixHT;
	private String compagnie;
	private boolean avionInclus;
	private boolean VoitureIncluse;
    /**
     * Default constructor
     */
    public Prestation() {
    }
    /**
     * Getter/Setter
     */
	public LocalDate getDateDepart() {
		return dateDepart;
	}
	public void setDateDepart(LocalDate dateDepart) {
		this.dateDepart = dateDepart;
	}
	public LocalDate getDateArrivee() {
		return dateArrivee;
	}
	public void setDateArrivee(LocalDate dateArrivee) {
		this.dateArrivee = dateArrivee;
	}
	public double getPrixHT() {
		return prixHT;
	}
	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}
	public String getCompagnie() {
		return compagnie;
	}
	public void setCompagnie(String compagnie) {
		this.compagnie = compagnie;
	}
	public long getRefPrestation() {
		return refPrestation;
	}
	public void setRefPrestation(long refPrestation) {
		this.refPrestation = refPrestation;
	}
	public boolean isAvionInclus() {
		return avionInclus;
	}
	public void setAvionInclus(boolean avionInclus) {
		this.avionInclus = avionInclus;
	}
	public boolean isVoitureIncluse() {
		return VoitureIncluse;
	}
	public void setVoitureIncluse(boolean voitureIncluse) {
		VoitureIncluse = voitureIncluse;
	}

 


}