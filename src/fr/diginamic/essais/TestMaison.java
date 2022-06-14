package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Piece;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) {
		Cuisine cuisine1 = new Cuisine(20.0d, 0);
		Salon salon1 = new Salon(30.0d, 0);
		WC wc1 = new WC(3.0d, 0);
		Chambre chambre1 = new Chambre(18, 0);
		Chambre chambre2 = new Chambre(13, 0);
		SalleDeBain sdb1 = new SalleDeBain(16, 0);

		
		Chambre chambre3 = new Chambre(20.0d, 1);
		Chambre chambre4 = new Chambre(20.0d, 1);
		Chambre chambre5 = new Chambre(20.0d, 1);
		Chambre chambre6 = new Chambre(20.0d, 1);
		WC wc2 = new WC(4.0d, 1);
		SalleDeBain sdb2 = new SalleDeBain(16, 1);
		
		Piece[] tabPiece = {cuisine1, salon1, wc1, chambre1, chambre2, sdb1};
		Maison maison = new Maison(tabPiece);
		maison.ajouterPiece(chambre3);
		maison.ajouterPiece(chambre4);
		maison.ajouterPiece(chambre5);
		maison.ajouterPiece(chambre6);
		maison.ajouterPiece(wc2);
		maison.ajouterPiece(sdb2);
		
		maison.ajouterPiece(null);
		
		double superfTotal = maison.getSuperficieMaison();
		System.out.println("Superficie de la maison : " + superfTotal + "\n");
		
		double superfEtage0 = maison.getSuperficieEtage(0);
		System.out.println("Superficie du rez de chaussée :  " + superfEtage0 + "\n");
		
		double superfEtage1 = maison.getSuperficieEtage(1);
		System.out.println("Superficie de l'étage 1 :  " + superfEtage1 + "\n");
	}

}
