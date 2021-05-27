package com.model.daos;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.stereotype.Repository;

import com.model.domaine.Adresse;
import com.model.domaine.Reservation;
import com.model.domaine.Voyage;
import com.model.domaine.Voyageur;
import com.model.util.JpaUtil;

@Repository("daoVoyage")
public class DAOVoyage implements IDAOVoyage{
	boolean success=false;

	public boolean addVoyage(Voyage vo) {
		try {
		EntityManager em=JpaUtil.getEmf().createEntityManager();

		// 2 : Ouverture transaction 
		EntityTransaction tx =  em.getTransaction();
		tx.begin();

		// 3 : Instanciation Objet(s) m�tier (s)

		
		// 4 : Persistance Objet/Relationnel : cr�ation d'un enregistrement en base
		em.persist(vo);

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