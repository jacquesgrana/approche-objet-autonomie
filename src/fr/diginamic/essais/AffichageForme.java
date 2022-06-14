package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {
	
	public static void display(Forme form) {
		System.out.println("Surface : " + form.calculateSurface() + " / Périmètre : " + form.calculatePerimetre());
	}

}
