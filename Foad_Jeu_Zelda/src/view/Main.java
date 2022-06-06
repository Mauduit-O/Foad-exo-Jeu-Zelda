package view;

import model.Arme;
import model.Joueur;
import model.Types;

public class Main {

	public static void main(String[] args) {
		
		Arme Excalibur = new Arme("Excalibur", Types.EPEE , 10);
		Arme Marteau = new Arme("Marteau", Types.MASSE , 5);
		
		Joueur zelda = new Joueur("Zelda", 5);
		Joueur mario = new Joueur("Mario", 0);
		
		zelda.changeArme(Excalibur);
		mario.changeArme(Marteau);
		
		zelda.attaque(mario);
		zelda.attaque(mario);
		zelda.attaque(mario);
		zelda.attaque(mario);
		zelda.attaque(mario);
		zelda.attaque(mario);
		zelda.attaque(mario);
		zelda.attaque(mario);
		zelda.attaque(mario);
		zelda.attaque(mario);
		zelda.attaque(mario);
		System.out.println(zelda);
		System.out.println(mario);
	}

}
