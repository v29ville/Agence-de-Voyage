package domaine;


public class Adresse {
	private String rue;
	private String ville;
	private int codePostal;
	private String pays;
	private String region;
    /**
     * Default constructor
     */
	public Adresse(String rue, String ville, int codePostal, String pays, String region) {
		super();
		this.rue = rue;
		this.ville = ville;
		this.codePostal = codePostal;
		this.pays = pays;
		this.region = region;
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
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

  

}