package com.model.domaine;


import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="hotel")
@Inheritance
//@DiscriminatorColumn
public class Hotel extends Prestation {
public String nomHotel;
public int nbEtoiles;
private ArrayList<Chambre> listeChambres;

@OneToOne
@JoinColumn(name="ADR_ID")
public Adresse adresseHotel;
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
	

   




}