package Domaine;

public class Chambre extends Hotel {
	private String typeChambre;
	private double prixChambre;
	private Pension prestationHerbergement ;
    /**
     * Default constructor
     */
    public Chambre() {	
    }
    /**
     * Getter/Setter
     */
	public String getTypeChambre() {
		return typeChambre;
	}
	public void setTypeChambre(String typeChambre) {
		this.typeChambre = typeChambre;
	}
	public double getPrixChambre() {
		return prixChambre;
	}
	public void setPrixChambre(double prixChambre) {
		this.prixChambre = prixChambre;
	}
	public Pension getPrestationHerbergement() {
		return prestationHerbergement;
	}
	public void setPrestationHerbergement(Pension prestationHerbergement) {
		this.prestationHerbergement = prestationHerbergement;
	}


}