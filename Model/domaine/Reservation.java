package domaine;

import java.util.*;

import services.AgencesVoyagesServices;
import services.AuthentificationManager;
import services.GieCbService;

public class Reservation {
	private int numReservation;
	private etatReservation etat;
	private ArrayList<Voyageur> listeVoyageur;
	private Client  myClient;
	private Assurance  myAssurance;
	private Voyage  myVoyage;
	private double prixTotal;
	private GieCbService banque;
	private AuthentificationManager authentificationManager;
	
    /**
     * Constructors
     */
	public Reservation() {}
	
    public Reservation(int numReservation, domaine.etatReservation etatReservation, ArrayList<Voyageur> listeVoyageur,
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
			this.etat=domaine.etatReservation.EnCours;}
		else if (authentificationManager.getAuthentifie()==true&& banque.soldeSuffisant() == true) {
			this.etat=domaine.etatReservation.Acceptee;
		}
		else {
			this.etat=domaine.etatReservation.Refusee;
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
    			 age,  myReservation);
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
    	prixTotal+= (myAssurance.getPrix()*listeVoyageur.size());
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