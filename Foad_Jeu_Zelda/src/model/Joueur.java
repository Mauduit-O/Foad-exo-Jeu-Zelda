package model;

//import java.util.Random;

public class Joueur {
	private String nom;
	private int sante = 10;
	private int force = (int) (Math.random()*(10-5)) + 5;
	private int experience = 1;
	private Arme arme;
	
	public Joueur(String nom, int force) {
		this.nom = nom;
		this.force = (int) (Math.random()*(10-5)) + 5;
	}
	

	public Arme desarmer() {
		System.out.println("vous avez été desarmé");
		return this.arme = null;
	}
	
	public Arme changeArme(Arme arme) {
		return this.arme = arme;
	}
	
	public void attaque(Joueur ennemi ) {
		
		if (this.sante > 0 && ennemi.sante > 0 ) {
			
			if (this.sante * this.force * this.experience * this.arme.getPuissance() > ennemi.sante * ennemi.force * ennemi.experience * ennemi.arme.getPuissance()) {
				
				this.force +=  1;
				ennemi.sante -=  1;
				System.out.println("Le vainqueur est " + this.nom + " ! Sorry, " + ennemi.nom + " a perdu !");
			}
			else {this.sante -=  1;
			ennemi.force +=  1;
			System.out.println("Le vainqueur est " + ennemi.nom + " ! Sorry, " + this.nom + " a perdu !");
			};
			this.experience += 1;
			ennemi.experience += 1;
			
		}  else if (this.sante <= 0 ) {
			System.err.println("\n" + this.nom + " est mort, " + ennemi.nom + " a gagner ! \n");
		} else {
			System.err.println("\n" + ennemi.nom + " est mort, " + this.nom + " a gagner ! \n");
		};		
	};


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getSante() {
		return sante;
	}

	public void setSante(int sante) {
		this.sante = sante;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public Arme getArme() {
		return arme;
	}

	public void setArme(Arme arme) {
		this.arme = arme;
	}

	@Override
	public String toString() {
		return "Joueur : " + nom + ", sante: " + sante + ", force: " + force + ", experience: " + experience + ", arme: "
				+ arme;
	}
	
	
}
