package com.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.model.daos.IDAOClient;
import com.model.domaine.Client;


@Service ("serviceClient")
public class ServiceClient implements IServiceClient{
	@Autowired
	@Qualifier("daoClient")
	private IDAOClient daoc;
	
	public void addClient(Client c) {
	daoc.addClient(c);
}
}