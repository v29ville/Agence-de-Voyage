package com.model.domaine;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.model.services.AgencesVoyagesServices;
import com.model.services.AuthentificationManager;
import com.model.services.GieCbService;
import com.model.domaine.Voyageur;

@Entity
@Table(name="Reservation")
public class Reservation {
	
	@Id
	private int numReservation;
	
	private etatReservation etat;
	private Client  myClient;
	private Assurance  myAssurance;
	private Voyage  myVoyage;
	private double prixTotal;
	private GieCbService banque;
	private AuthentificationManager authentificationManager;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable (name="ReservationVoyageur",
			joinColumns=@JoinColumn(name="myReservation"))
	private ArrayList<Voyageur> listeVoyageur = new ArrayList <Voyageur>(0);
    /**
     * Constructors
     */
	public Reservation() {}
	
    public Reservation(int numReservation, com.model.domaine.etatReservation etatReservation, ArrayList<Voyageur> listeVoyageur,
			Client myClient, Assurance myAssurance, Voyage myVoyage) {
		this.numReservation = numReservation;
		this.etat = etatReservation;
		this.listeVoyageur = listeVoyageur;
		this.myClient = myClient;
		this.myAssurance = myAssurance;
		this.myVoyage = myVoyage;
		this.listeVoyageur= new ArrayList<Voyageur>();
	}

	/**
     * Getter/Setter
     */
    public int getNumReservation() {
		return numReservation;
	}
	public void setNumReservation(int numReservation) {
		this.numReservation = numReservation;
	}
	public ArrayList<Voyageur> getListeVoyageur() {
		return listeVoyageur;
	}
	public void setListeVoyageur(ArrayList<Voyageur> listeVoyageur) {
		this.listeVoyageur = listeVoyageur;
	}
	public Client getMyClient() {
		return myClient;
	}
	public void setMyClient(Client myClient) {
		this.myClient = myClient;
	}
	public Assurance getMyAssurance() {
		return myAssurance;
	}
	public void setMyAssurance(Assurance myAssurance) {
		this.myAssurance = myAssurance;
	}
	public Voyage getMyVoyage() {
		return myVoyage;
	}
	public void setMyVoyage(Voyage myVoyage) {
		this.myVoyage = myVoyage;
	}
	public etatReservation getEtatReservation() {
		return etat;
	}
	/**
     * setter reservation state
     */
	public void setEtatReservation(etatReservation etatReservation) {
		if (authentificationManager.getAuthentifie()==true) {
			this.etat=com.model.domaine.etatReservation.EnCours;}
		else if (authentificationManager.getAuthentifie()==true&& banque.soldeSuffisant() == true) {
			this.etat=com.model.domaine.etatReservation.Acceptee;
		}
		else {
			this.etat=com.model.domaine.etatReservation.Refusee;
		}
	}
	/**
     * @param Ajouter Voyageur
     */
    public void addVoyageur(String civilite, String nom, String prenom, String email, Adresse myAdresse, String pieceIdentite,
			int age, Reservation myReservation) {
    	Scanner sc= new Scanner(System.in);
  		System.out.println("Entrez le nombre de voyageurs:");
  		int nbrVoyageurs= sc.nextInt();
  		int i=0;
  		while (i<nbrVoyageurs) {
    	Voyageur voyageur = new Voyageur( civilite,  nom,  prenom,  email,  myAdresse,  pieceIdentite,
    			 age);
    	listeVoyageur.add(voyageur);}
  		sc.close();
    }
    
    /**
     * @param Supprimer Voyageur
     */
    public void removeVoyageur(Voyageur voyageur) {
    	
    	listeVoyageur.remove(voyageur);    }

    /**
     * @param Prix
     */
    public double getPrix() {
    	prixTotal=0;
    	prixTotal+= (myVoyage.getPrix()*listeVoyageur.size());
    	prixTotal+= (myAssurance.getPrixAssurance()*listeVoyageur.size());
return prixTotal;
}
    
    
  //Catalogue
public void reserver (Client c) {	
		AgencesVoyagesServices agence= new AgencesVoyagesServices();
		for (Voyage v: agence.getOffres()) {
			v.toString();
		}
		Scanner sc= new Scanner(System.in);
			int numVoyage= sc.nextInt();
			for (Voyage v: agence.getOffres()) {
				if (v.getNumeroVoyage()==numVoyage) {
					this.myVoyage=v;
			}
		}
		sc.close();
		
	}


}