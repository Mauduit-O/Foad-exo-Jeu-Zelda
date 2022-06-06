package model;

public class Arme {
	
	private String nom;
	private Types type;
	private int puissance;
	
	public Arme(String nom, Types type, int puissance) {
		this.nom = nom;
		this.type = type;
		this.puissance = puissance;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Types getType() {
		return type;
	}

	public void setType(Types type) {
		this.type = type;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	@Override
	public String toString() {
		return nom + " type: " + type + " puissance: " + puissance;
	}

	
}
