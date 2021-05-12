package com.model.domaine;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Table;

@Table(name="client")
@DiscriminatorValue("CLIENT")
public class Client extends Personne {

private String user = "Client1";
private String passWord = "12345";
private CB cb;
private Reservation  myReservation;
    /**
     * Default constructor
     */
	public Client(String civilite, String nom, String prenom, String email, Adresse myAdresse,
			CB cb, Reservation myReservation) {
		super(civilite, nom, prenom, email, myAdresse);
		this.cb = cb;
		this.myReservation = myReservation;
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

	public Reservation getMyReservation() {
		return myReservation;
	}

	public void setMyReservation(Reservation myReservation) {
		this.myReservation = myReservation;
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

	}
    