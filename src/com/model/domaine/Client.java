package com.model.domaine;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
//@Table
@DiscriminatorValue("CLIENT")
public class Client extends Personne {
	
	private int clientID;
	
private String user = "Client1";
private String passWord = "12345";

@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="CB_CLIENT", referencedColumnName="cbID")
private CB cb;

@OneToMany(mappedBy="myClient")
private List<Reservation>  myReservation;
    /**
     * Default constructor
     */
public Client(String civilite, String nom, String prenom, String email, Adresse myAdresse, int clientID,
			String user, String passWord, CB cb, ArrayList<Reservation> myReservation) {
		super(civilite, nom, prenom, email, myAdresse);
		this.clientID = clientID;
		this.user = user;
		this.passWord = passWord;
		this.cb = cb;
		this.myReservation = myReservation;
	}
	public Client() {
	}



	/**
     * Getter/Setter
     */

	public CB getMoyenPaiement() {
		return cb;
	}

	public void setMoyenPaiement(CB cb) {
		this.cb = cb;
	}
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public int getClientID() {
		return clientID;
	}
	public void setClientID(int clientID) {
		this.clientID = clientID;
	}
	public CB getCb() {
		return cb;
	}
	public void setCb(CB cb) {
		this.cb = cb;
	}
	public List<Reservation> getMyReservation() {
		return myReservation;
	}
	public void setMyReservation(ArrayList<Reservation> myReservation) {
		this.myReservation = myReservation;
	}

	}
    