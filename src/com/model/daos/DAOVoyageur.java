package com.model.daos;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.stereotype.Repository;

import com.model.domaine.Voyageur;
import com.model.util.JpaUtil;
import com.model.domaine.Adresse;
import com.model.domaine.Reservation;

@Repository("daoVoyageur")
public class DAOVoyageur implements IDAOVoyageur{boolean success=false;

public boolean addVoyageur(Voyageur v) {
try {
EntityManager em=JpaUtil.getEmf().createEntityManager();

// 2 : Ouverture transaction 
EntityTransaction tx =  em.getTransaction();
tx.begin();

// 3 : Instanciation Objet(s) m�tier (s)
//Contact contact = new Contact(firstname,lastname, email);


// 4 : Persistance Objet/Relationnel : cr�ation d'un enregistrement en base
em.persist(v);

// 5 : Fermeture transaction 
tx.commit();

// 6 : Fermeture de l'EntityManager et de unit� de travail JPA 
em.close();
	

success=true;
}
catch (Exception e) {
	e.printStackTrace();
	
}
return success;
}

}
/**
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
} **/