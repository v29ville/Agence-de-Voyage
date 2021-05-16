package com.model.domaine;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CB {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long cbId;
	
	private String banque;
	private double solde;
	private int numeroCB;
	private String dateExpiration;
	private Boolean valide;
	
	@OneToOne(cascade=CascadeType.ALL, mappedBy="cb")
	private Client client;
    /**
     * Default constructor
     */
   
	public CB(String banque, double solde, int numeroCB, String dateExpiration) {
		super();
		this.banque = banque;
		this.solde = solde;
		this.numeroCB = numeroCB;
		this.dateExpiration = dateExpiration;
	}

    public CB() {};
    public CB(String banque, double solde) {
    	this.banque = banque;
		this.solde = solde;
    }
	/**
     * Getter/Setter
     */
	public int getNumeroCB() {
		return numeroCB;
	}

	public void setNumeroCB(int numeroCB) {
		this.numeroCB = numeroCB;
	}

	public String getDateExpiration() {
		return dateExpiration;
	}

	public void setDateExpiration(String dateExpiration) {
		this.dateExpiration = dateExpiration;
	}

	public String getBanque() {
		return banque;
	}

	public void setBanque(String banque) {
		this.banque = banque;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Boolean getValide() {
		return valide;
	}

	public void setValide(Boolean valide) {
		this.valide = valide;
	}

	public long getCbId() {
		return cbId;
	}

	public void setCbId(long cbId) {
		this.cbId = cbId;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
/*public void validite(String dateExpiration, String dateJour) {
	if (dateJour.compareTo(dateExpiration)<0) {
		this.valide=true ;	}
	else {
		this.valide=false;
	}
}   */
}