package Domaine;

public class Client extends Personne {
private Facture myFacture;
private MoyenPaiement moyenPaiement;
private Reservation  myReservation;
private String user = "Client1";
private String passWord = "12345";
    /**
     * Default constructor
     */
	public Client(String civilite, String nom, String prenom, String email, Adresse myAdresse, Facture myFacture,
			MoyenPaiement moyenPaiement, Reservation myReservation) {
		super(civilite, nom, prenom, email, myAdresse);
		this.myFacture = myFacture;
		this.moyenPaiement = moyenPaiement;
		this.myReservation = myReservation;
	}

	/**
     * Getter/Setter
     */
	public Facture getMyFacture() {
		return myFacture;
	}

	public void setMyFacture(Facture myFacture) {
		this.myFacture = myFacture;
	}

	public MoyenPaiement getMoyenPaiement() {
		return moyenPaiement;
	}

	public void setMoyenPaiement(MoyenPaiement moyenPaiement) {
		this.moyenPaiement = moyenPaiement;
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

	public boolean authentification(String userName, String password) {
		
		return userName==this.user && password==this.passWord;
		
	}
    



}