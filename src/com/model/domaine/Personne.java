package com.model.domaine;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//@Entity
@MappedSuperclass
@Table(name="personne")
@Inheritance
@DiscriminatorColumn(name="PERS_TYPE")
public abstract class Personne {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long personneId;
	
	 private String civilite;
	 private String nom;
	 private String prenom;
	 private String email;
	 
	 @Autowired
		@Qualifier("adresse1")
	 @OneToOne(cascade=CascadeType.PERSIST)
	 @JoinColumn(name="ADR_ID")
		private Adresse  myAdresse;
	
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
	public long getPersonneId() {
		return personneId;
	}
	public void setPersonneId(long personneId) {
		this.personneId = personneId;
	}
	

 


}