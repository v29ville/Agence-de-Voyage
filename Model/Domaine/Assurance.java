package Domaine;

public class Assurance {
	private double prix;
	private Contrat contrat;
	private Reservation myReservation;
    /**
     * Default constructor
     */
	public Assurance(double prix, Contrat contrat, Reservation myReservation) {
		super();
		this.prix = prix;
		this.contrat = contrat;
		this.myReservation = myReservation;
	}
    /**
     * Getter/Setter
     */
	public double getPrix() {
		return prix;
	}
	
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Contrat getContrat() {
		return contrat;
	}
	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}
	public Reservation getMyReservation() {
		return myReservation;
	}
	public void setMyReservation(Reservation myReservation) {
		this.myReservation = myReservation;
	}


}