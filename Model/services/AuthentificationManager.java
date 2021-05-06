package services;

import java.util.Scanner;

import domaine.Client;

public class AuthentificationManager {
private Client client;
private Boolean authentifie;
    /**
     * Default constructor
     */
    public AuthentificationManager() {
    }
    
    
    public Boolean getAuthentifie() {
		return authentifie;
	}


	public void setAuthentifie(Boolean authentifie) {
		this.authentifie = authentifie;
	}


	/**
     * Authentification
     */
    public void authentification (Client client) {
    	Scanner sc= new Scanner(System.in);
    	boolean authentifie=false;
    	int nbEssais=0;
    	while(authentifie==false && nbEssais<5) {
    		System.out.println("Entrez votre identifiant:");
    		String ident = sc.next();
    		System.out.println("Entrez votre mot de passe:");
    		String mdp = sc.next();
    		if (ident == client.getUser() && mdp==client.getPassWord()) {
    			 authentifie=true;
    		}
    		System.out.println("L'authentification réussi.");
    	//authentifie = client.authentification(ident, mdp);
    	nbEssais++;
    	sc.close();
    }
    	System.out.println("L'authentification a échouée.");	
    	
}
}