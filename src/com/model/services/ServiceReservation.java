package com.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.model.daos.IDAOReservation;
import com.model.domaine.Reservation;


@Service ("serviceReservation")
public class ServiceReservation implements IServiceReservation{

	@Autowired
	@Qualifier("daoReservation")
	private IDAOReservation daor;
	
	public void addReservation(Reservation r) {
	daor.addReservation(r);
}
}
