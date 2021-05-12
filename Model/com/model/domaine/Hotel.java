package com.model.domaine;


import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

@Entity
@Table(name="hotel")
@Inheritance
//@DiscriminatorColumn
public class Hotel extends Prestation {
public String nomHotel;
public int nbEtoiles;
private ArrayList<Chambre> listeChambres;
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