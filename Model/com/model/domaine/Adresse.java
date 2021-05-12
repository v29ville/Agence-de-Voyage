package com.model.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adresse {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long adresseId;
	
	private String rue;
	private String ville;
	private int codePostal;
	private String pays;
	//deleted region
    /**
     * Default constructor
     */
	public Adresse(String rue, String ville, int codePostal, String pays) {
		this.rue = rue;
		this.ville = ville;
		this.codePostal = codePostal;
		this.pays = pays;
	}
	
    public Adresse() {
	}

	/**
     * Getter/Setter
     */
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}

	public long getAdresseId() {
		return adresseId;
	}

	public void setAdresseId(long adresseId) {
		this.adresseId = adresseId;
	}

	@Override
	public String toString() {
		return "Adresse [rue=" + rue + ", ville=" + ville + ", codePostal=" + codePostal + ", pays=" + pays + "]";
	}
	
	

  

}