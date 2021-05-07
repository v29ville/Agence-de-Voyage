package com.model.domaine;

public abstract class MoyenPaiement {
public String banque;
private double solde;
    /**
     * Constructor
     */
public MoyenPaiement() {
}
    public MoyenPaiement(String banque, double solde) {
		this.banque = banque;
		this.solde = solde;
	}

	/**
     * Getter/Setter
     */
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}

}