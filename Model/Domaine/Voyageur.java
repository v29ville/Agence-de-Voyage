package Domaine;

public class Voyageur extends Personne {
	private String pieceIdentite;
	private int age;
	private Reservation myReservation;
    /**
     * Default constructor
     */
    public Voyageur(String civilite, String nom, String prenom, String email, Adresse myAdresse, String pieceIdentite,
			int age, Reservation myReservation) {
		super(civilite, nom, prenom, email, myAdresse);
		this.pieceIdentite = pieceIdentite;
		this.age = age;
		this.myReservation = myReservation;
	}

	public Voyageur(String pieceIdentite, int age, Reservation myReservation) {
		super();
		this.pieceIdentite = pieceIdentite;
		this.age = age;
		this.myReservation = myReservation;
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
	public Reservation getMyReservation() {
		return myReservation;
	}
	public void setMyReservation(Reservation myReservation) {
		this.myReservation = myReservation;
	}

    


}