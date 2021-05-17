package com.model.domaine;


import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
//@Table(name="hotel")
@Inheritance
//@DiscriminatorColumn
public class Hotel extends Prestation {
	private String nomHotel;
private int nbEtoiles;
private ArrayList<Chambre> listeChambres;

@OneToOne (cascade=CascadeType.ALL)
@JoinColumn(name="ADR_ID")
private Adresse adresseHotel;
    /**
     * Default constructor
     */
    public Hotel() {
    }
    /**
     * Getter/Setter
     */
	public ArrayList<Chambre> getListeChambres() {
		return listeChambres;
	}
	public void setListeChambres(ArrayList<Chambre> listeChambres) {
		this.listeChambres = listeChambres;
	}
	public String getNomHotel() {
		return nomHotel;
	}
	public void setNomHotel(String nomHotel) {
		this.nomHotel = nomHotel;
	}
	public int getNbEtoiles() {
		return nbEtoiles;
	}
	public void setNbEtoiles(int nbEtoiles) {
		this.nbEtoiles = nbEtoiles;
	}
	public Adresse getAdresseHotel() {
		return adresseHotel;
	}
	public void setAdresseHotel(Adresse adresseHotel) {
		this.adresseHotel = adresseHotel;
	}
	

   




}