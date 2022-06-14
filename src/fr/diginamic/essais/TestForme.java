package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {
		Cercle circle = new Cercle(100.0d);
		Rectangle rectangle = new Rectangle(50.0d, 125.0d);
		Carre carre = new Carre(100.0d);
		
		System.out.println("Cercle :");
		AffichageForme.display(circle);
		
		System.out.println("\nRectangle :");
		AffichageForme.display(rectangle);
		
		System.out.println("\nCarré :");
		AffichageForme.display(carre);

	}

}
