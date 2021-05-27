package com.model.daos;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.stereotype.Repository;


import com.model.domaine.Client;

import com.model.util.JpaUtil;

@Repository("daoClient")
public class DAOClient implements IDAOClient{
	boolean success=false;
	
	@Override
	public boolean addClient(Client c) {
		try {
			EntityManager em=JpaUtil.getEmf().createEntityManager();

			// 2 : Ouverture transaction 
			EntityTransaction tx =  em.getTransaction();
			tx.begin();

			// 3 : Instanciation Objet(s) m�tier (s)

		

			// 4 : Persistance Objet/Relationnel : cr�ation d'un enregistrement en base
			
			em.persist(c);

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
