package Domaine;

import java.time.LocalDate;

public class CB extends MoyenPaiement {
	private int numeroCB;
	private LocalDate dateExpiration;
	public Boolean validite;

    /**
     * Default constructor
     */
    public CB(String banque, double solde, int numeroCB, LocalDate dateExpiration) {
		super(banque, solde);
		this.numeroCB = numeroCB;
		this.dateExpiration = dateExpiration;
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

	public LocalDate getDateExpiration() {
		return dateExpiration;
	}

	public void setDateExpiration(LocalDate dateExpiration) {
		this.dateExpiration = dateExpiration;
	}
public boolean validite(LocalDate dateExpiration, LocalDate dateJour) {
	
		return dateJour.compareTo(dateExpiration)>0 ;
		
	}
    
}