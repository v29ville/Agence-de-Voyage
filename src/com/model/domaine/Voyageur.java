package com.model.domaine;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="voyageur")
@DiscriminatorValue("VOYAGEUR")
public class Voyageur extends Personne {
	
	private long voyageurId;
	
	private String pieceIdentite;
	private int age;
	
	
	@ManyToMany (cascade=CascadeType.ALL,mappedBy="listeVoyageur")
	private ArrayList<Reservation> Reservations = new ArrayList <Reservation>(0);
	
    /**
     * Default constructor
     */
    public Voyageur(String civilite, String nom, String prenom, String email, Adresse myAdresse, String pieceIdentite,
			int age) {
		super(civilite, nom, prenom, email, myAdresse);
		this.pieceIdentite = pieceIdentite;
		this.age = age;
	}

	public Voyageur(String pieceIdentite, int age) {
		this.pieceIdentite = pieceIdentite;
		this.age = age;
	}
	public Voyageur(String civilite, String nom, String prenom, String email, Adresse myAdresse, String pieceIdentite,
			int age, ArrayList<Reservation> reservations) {
		super(civilite, nom, prenom, email, myAdresse);
		this.pieceIdentite = pieceIdentite;
		this.age = age;
		Reservations = reservations;
	}
	public Voyageur() {
	}
	/**
     * Getter/Setter
     */
	public String getPieceIdentite() {
		return pieceIdentite;
	}
	public void setPieceIdentite(String pieceIdentite) {
		this.pieceIdentite = pieceIdentite;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public long getVoyageurId() {
		return voyageurId;
	}

	public void setVoyageurId(long voyageurId) {
		this.voyageurId = voyageurId;
	}

	public ArrayList<Reservation> getReservations() {
		return Reservations;
	}

	public void setReservations(ArrayList<Reservation> reservations) {
		Reservations = reservations;
	}

	@Override
	public String toString() {
		return "Voyageur [voyageurId=" + voyageurId + ", pieceIdentite=" + pieceIdentite + ", age=" + age
				+ ", Reservations=" + Reservations + "]";
	}

	public void testInit() {
		System.out.println("Bienvenue aux voyageurs!");
	}
    


}