package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		Theatre myTh = new Theatre("Thêatre de la mer", 1000, 0, 0);
		
		System.out.println("Avant ajouts : nbInscrit : " + myTh.getNbInscription() + " recette totale : " + myTh.getTotalIncome() + "\n");
		
		myTh.inscrire(200, 40.0);
		System.out.println("Après 1e ajout : nbInscrit : " + myTh.getNbInscription() + " recette totale : " + myTh.getTotalIncome() + "\n");
		
		myTh.inscrire(300, 25.0);
		System.out.println("Après 2e ajout : nbInscrit : " + myTh.getNbInscription() + " recette totale : " + myTh.getTotalIncome() + "\n");
		
		myTh.inscrire(400, 15.0);
		System.out.println("Après 3e ajout : nbInscrit : " + myTh.getNbInscription() + " recette totale : " + myTh.getTotalIncome() + "\n");
		
		myTh.inscrire(100, 50.0);
		System.out.println("Après 4e ajout : nbInscrit : " + myTh.getNbInscription() + " recette totale : " + myTh.getTotalIncome() + "\n");
		
		myTh.inscrire(200, 18.0);
		System.out.println("Après 5e ajout : nbInscrit : " + myTh.getNbInscription() + " recette totale : " + myTh.getTotalIncome() + "\n");

	}

}
