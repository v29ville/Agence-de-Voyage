package com.model.services;

import com.model.domaine.Client;
import com.model.domaine.Reservation;
import com.model.domaine.Voyage;
import com.model.domaine.Voyageur;

public interface Visitor {

	public void visit(Voyageur v);
	
	public void visit (Client c);
	
	public void visit (Voyage vo);
	
	public void visit (Reservation r);
}
