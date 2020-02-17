package dos;

public class SerieDO {
	private int id;
	private String nom;
	private Boolean production_originale;
	private int annee;
	
	public SerieDO(int id, String nom, Boolean production_originale, int annee) {
		this.id= id;
		this.nom= nom;
		this.production_originale= production_originale;
		this.annee= annee;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Boolean getProduction_originale() {
		return production_originale;
	}
	public void setProduction_originale(Boolean production_originale) {
		this.production_originale = production_originale;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	
	

}
