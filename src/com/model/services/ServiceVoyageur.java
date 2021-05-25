package com.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.model.daos.IDAOVoyageur;
import com.model.domaine.Voyageur;

@Service ("serviceVoyageur")
public class ServiceVoyageur implements IServiceVoyageur {
	 
		@Autowired
		@Qualifier("daoVoyageur")
		private IDAOVoyageur dao;
		
		public void addVoyageur(Voyageur v) {
		dao.addVoyageur(v);
}
/**
		@Override
		public void accept(Visitor visitor) {	
		}**/
}
