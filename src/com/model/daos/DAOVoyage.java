package com.model.daos;

import java.util.ArrayList;

import com.model.domaine.Adresse;
import com.model.domaine.Reservation;
import com.model.domaine.Voyageur;

public class DAOVoyage implements IDAOReservation{

	@Override
	public Voyageur addVoyageur(String civilite, String nom, String prenom, String email, Adresse myAdresse,
			String pieceIdentite, int age, Reservation myReservation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteVoyageur(String pieceIdentite, Reservation myReservation) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Voyageur getVoyageur(String pieceIdentite, Reservation myReservation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modifyVoyageur(String civilite, String nom, String prenom, String email, Adresse myAdresse,
			String pieceIdentite, int age, Reservation myReservation) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Voyageur> getVoyageurByFirstName(String firstname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Voyageur> getVoyageurByLastName(String lastname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Voyageur> getVoyageurByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
}