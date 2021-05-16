package com.model.daos;

import java.util.ArrayList;

import com.model.domaine.Adresse;
import com.model.domaine.Reservation;
import com.model.domaine.Voyageur;

public interface IDAOVoyageur {

	
	public boolean addVoyageur(Voyageur v);
	
	//public boolean deleteVoyageur(String pieceIdentite, Reservation myReservation);
	
	//public Voyageur getVoyageur(String pieceIdentite, Reservation myReservation);
	
	//public boolean modifyVoyageur(String civilite, String nom, String prenom, String email, Adresse myAdresse, String pieceIdentite,
	//		int age, Reservation myReservation);
	
	//public ArrayList<Voyageur> getVoyageurByFirstName(String firstname);
	
	//public ArrayList<Voyageur> getVoyageurByLastName(String lastname);
	
	//public ArrayList<Voyageur> getVoyageurByEmail(String email);
	
}
