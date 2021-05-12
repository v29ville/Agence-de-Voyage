package com.model.domaine;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.model.services.AuthentificationManager;
import com.model.services.GieCbService;
import com.model.domaine.Voyageur;

@Entity
@Table(name="Reservation")
public class Reservation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numReservation;
	
	private etatReservation etat;
	private double prixTotal;
	private GieCbService banque;
	private AuthentificationManager authentificationManager;
	private Client  myClient;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable (name="RESAVoyages",
	joinColumns=@JoinColumn(name="numeroVoyage"),
	inverseJoinColumns=@JoinColumn(name="NUMRESERVATION"))
	private ArrayList<Voyage>  myVoyages= new ArrayList<Voyage>(0);
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable (name="ReservationVoyageur",
			joinColumns=@JoinColumn(name="myReservation"),
			inverseJoinColumns=@JoinColumn(name="NUMRESERVATION", referencedColumnName="numReservation"))
	private ArrayList<Voyageur> listeVoyageur = new ArrayList <Voyageur>(0);
	
	@OneToOne
	@JoinColumn(name="RESA_ASSU", referencedColumnName="assuranceID")
	private Assurance  myAssurance;
	
    /**
     * Constructors
     */
	public Reservation() {}

	
	public Reservation(int numReservation, etatReservation etat, double prixTotal) {
		super();
		this.numReservation = numReservation;
		this.etat = etat;
		this.prixTotal = prixTotal;
	}

	public Reservation(int numReservation, etatReservation etat, double prixTotal, GieCbService banque,
			AuthentificationManager authentificationManager, Client myClient, ArrayList<Voyage> myVoyages,
			ArrayList<Voyageur> listeVoyageur, Assurance myAssurance) {
		super();
		this.numReservation = numReservation;
		this.etat = etat;
		this.prixTotal = prixTotal;
		this.banque = banque;
		this.authentificationManager = authentificationManager;
		this.myClient = myClient;
		this.myVoyages = myVoyages;
		this.listeVoyageur = listeVoyageur;
		this.myAssurance = myAssurance;
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
	
	public etatReservation getEtatReservation() {
		return etat;
	}
	public double getPrixTotal() {
		return prixTotal;
	}
	//to edit
	//public void setPrixTotal(double prixTotal) {
	//	this.prixTotal = prixTotal;
	//}


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
	
	public etatReservation getEtat() {
		return etat;
	}


	public void setEtat(etatReservation etat) {
		this.etat = etat;
	}


	public ArrayList<Voyage> getMyVoyages() {
		return myVoyages;
	}


	public void setMyVoyages(ArrayList<Voyage> myVoyages) {
		this.myVoyages = myVoyages;
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
*/

}