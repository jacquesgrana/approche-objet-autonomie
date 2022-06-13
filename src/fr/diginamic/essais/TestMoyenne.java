package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		
		double[] tab1 = {12.5, 15, 10.25, 5, 0.5};
		CalculMoyenne moy1 = new CalculMoyenne(tab1);
		
		System.out.println("Tab 1 : moyenne : " + moy1.calcul() + "\n");
		
		moy1.ajout(18.5d);
		System.out.println("Tab 1 : moyenne après ajout : " + moy1.calcul() + "\n");
		
		
		double[] tab2 = {10};
		CalculMoyenne moy2 = new CalculMoyenne(tab2);
		
		System.out.println("Tab 2 : moyenne : " + moy2.calcul() + "\n");
		
		moy2.ajout(20.0d);
		System.out.println("Tab 2 : moyenne après 1e ajout : " + moy2.calcul() + "\n");
		
		moy2.ajout(0.0d);
		System.out.println("Tab 2 : moyenne après 2e ajout : " + moy2.calcul() + "\n");


	}

}
