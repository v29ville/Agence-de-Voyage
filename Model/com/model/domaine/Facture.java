package com.model.domaine;

public class Facture {
	private Client  myClient;
    private Reservation myReservation;
    /**
     * Default constructor
     */
    public Facture() {
    }
    /**
     * Getter/Setter
     */
	public Client getMyClient() {
		return myClient;
	}
	public void setMyClient(Client myClient) {
		this.myClient = myClient;
	}
	public Reservation getMyReservation() {
		return myReservation;
	}
	public void setMyReservation(Reservation myReservation) {
		this.myReservation = myReservation;
	}


}