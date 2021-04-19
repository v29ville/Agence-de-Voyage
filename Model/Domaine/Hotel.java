package Domaine;


import java.util.*;

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