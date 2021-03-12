package Etudiant;

import java.util.ArrayList;
import java.util.List;

public class sePresenter {

	public static void main(String[] args) {
				
		Chien newChien = new Chien(57, 3, "Rocket", "Labrador croisé Border Colli");
		Chien newnewChien = new Chien(45, 18, "Filou", "Berger Suisse");
		Etudiant newEtudiant = new Etudiant("Dolivet", "Pierr", 18, "BTS SIO");
		//Etudiant ScEtudiant = new Etudiant("DOUSSAIN", "Jimm", 19, "BTS SIO");
		Panda Pandaa = new Panda(200, 17, "Panda", "Contrôler les plantes", "Jujutsu Kaisen");		
		
		//Liste chiens
		List<Chien> chenil = new ArrayList<Chien>();
		
		//Ajoute un chien
		chenil.add(newChien);
		chenil.add(newnewChien);	
		
		//Ajout d'un chien a l'étudiant
		newEtudiant.AddChien(newChien);
		newEtudiant.AddChien(newnewChien);
		
		System.out.println("Le(s) chien(s) de l'étudiant est/sont :");
	
		//Lecture de tous les noms de animaux
		newEtudiant.sePresenter();
		Pandaa.sePresenter();
		
		//
		
	}

}
