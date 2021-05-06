package domaine;

import java.util.*;

import services.AgencesVoyagesServices;

public class Reservation {
	private int numReservation;
	private etatReservation etat;
	private ArrayList<Voyageur> listeVoyageur;
	private Client  myClient;
	private Assurance  myAssurance;
	private Voyage  myVoyage;
	private double prixTotal;
	
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
	public etatReservation getEtatReservation() {
		return etat;
	}
	public void setEtatReservation(etatReservation etatReservation) {
		this.etat = etatReservation;
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




	/**
     * @param Ajouter Voyageur
     */
    public void addVoyageur(String civilite, String nom, String prenom, String email, Adresse myAdresse, String pieceIdentite,
			int age, Reservation myReservation) {
    	Voyageur voyageur = new Voyageur( civilite,  nom,  prenom,  email,  myAdresse,  pieceIdentite,
    			 age,  myReservation);
    	listeVoyageur.add(voyageur);}
    
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
    
    
    //M2THODE DEVRAIT ÊTRE à PARTIR DE CLIENT changer this en reservation
public void reserver (Client c) {
	// authentification
	Scanner sc= new Scanner(System.in);
	boolean authentifie=false;
	int nbEssais=0;
	while(authentifie==false && nbEssais<5) {
		System.out.println("Entrez votre identifiant:");
		String ident = sc.next();
		System.out.println("Entrez votre mot de passe:");
		String mdp = sc.next();
	authentifie = c.authentification(ident, mdp);
	nbEssais++;
}
	
	if (authentifie==true) {
		this.etat=domaine.etatReservation.EnCours;
		//Catalogue
		AgencesVoyagesServices agence= new AgencesVoyagesServices();
		for (Voyage v: agence.getOffres()) {
			v.toString();
		}
			int numVoyage= sc.nextInt();
			for (Voyage v: agence.getOffres()) {
				if (v.getNumeroVoyage()==numVoyage) {
					this.myVoyage=v;
			}
		}
		
		
		//Voyageurs
		System.out.println("Entrez le nombre de voyageurs:");
		int nbrVoyageurs= sc.nextInt();
		int i=0;
		while (i<nbrVoyageurs) {
			Voyageur v = new Voyageur (sc.next(),sc.nextInt(),this);
			listeVoyageur.add(v);
		}
	}
	//Choix assurance
	System.out.println("Souhaitez-vous une assurance? oui/non");
	String assurrance= sc.next();
	while (assurrance != "oui" && assurrance !="non") {
		System.out.println("Réponse non valide");
	}
	if (assurrance.equals("non")) {
		System.out.println("Vous voyagerez sans assurance.");
	}
	else if (assurrance.equals("oui")) {
		System.out.println("Entrez type d'assurance: 1 pour annulation, 2 pour autre");
		int typeAssurance = sc.nextInt();
		if (typeAssurance ==1) {
			Contrat contrat= new Contrat();
			this.myAssurance= new AssuranceAnnulation(100, contrat, this);
			}
			//add 2 et others
		
		//Paiement
		System.out.println("Entrez votre mode de paiement: 1 pour CB, 2 pour autre");
		int mode= sc.nextInt();
		if (mode==1) {
			CB cb =new CB(sc.next(), sc.nextDouble(), sc.nextInt(), sc.next());
		
		if (cb.valide == true) {
			//tester solde
			if (cb.getSolde()>=this.getPrix())
			this.etat=domaine.etatReservation.Acceptee;
			//payer
		}
		else {
			this.etat=domaine.etatReservation.Refusee;
		}
		
		}
	
	sc.close();

}
	}
}