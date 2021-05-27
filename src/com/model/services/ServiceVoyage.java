package com.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.model.daos.IDAOVoyage;
import com.model.domaine.Voyage;

@Service ("serviceVoyage")
public class ServiceVoyage implements IServiceVoyage {

	@Autowired
	@Qualifier("daoVoyage")
	private IDAOVoyage daov;
	
	public void addVoyage(Voyage vog) {
	daov.addVoyage(vog);

}
}