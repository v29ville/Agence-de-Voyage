package domaine;

public abstract class Personne {
	 private String civilite;
	 private String nom;
	 private String prenom;
	 private String email;
	 private Adresse myAdresse;
    /**
     * Default constructor
     */
    public Personne(String civilite, String nom, String prenom, String email, Adresse myAdresse) {
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.myAdresse = myAdresse;
	}
    public Personne()
    {}
	/**
     * Getter/Setter
     */
	public String getCivilite() {
		return civilite;
	}
	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Adresse getMyAdresse() {
		return myAdresse;
	}
	public void setMyAdresse(Adresse myAdresse) {
		this.myAdresse = myAdresse;
	}

 


}