package domaine;



public class CB extends MoyenPaiement {
	private int numeroCB;
	private String dateExpiration;
	public Boolean valide;

    /**
     * Default constructor
     */
    public CB(String banque, double solde, int numeroCB, String dateExpiration) {
		super(banque, solde);
		this.numeroCB = numeroCB;
		this.dateExpiration = dateExpiration;
	}
    public CB() {};
    public CB(String banque, double solde) {
    	super(banque, solde);
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
/*public void validite(String dateExpiration, String dateJour) {
	if (dateJour.compareTo(dateExpiration)<0) {
		this.valide=true ;	}
	else {
		this.valide=false;
	}
}   */
}