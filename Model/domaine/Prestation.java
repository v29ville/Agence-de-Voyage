package domaine;

import java.time.LocalDate;

public abstract class Prestation {
	private LocalDate dateDepart;
	private LocalDate dateArrivee;
	private double prixHT;
	private String compagnie;
    /**
     * Default constructor
     */
    public Prestation() {
    }
    /**
     * Getter/Setter
     */
	public LocalDate getDateDepart() {
		return dateDepart;
	}
	public void setDateDepart(LocalDate dateDepart) {
		this.dateDepart = dateDepart;
	}
	public LocalDate getDateArrivee() {
		return dateArrivee;
	}
	public void setDateArrivee(LocalDate dateArrivee) {
		this.dateArrivee = dateArrivee;
	}
	public double getPrixHT() {
		return prixHT;
	}
	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}
	public String getCompagnie() {
		return compagnie;
	}
	public void setCompagnie(String compagnie) {
		this.compagnie = compagnie;
	}

 


}