package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		Cercle c1 = new Cercle(50.0d);
		Cercle c2 = new Cercle(250.0d);
		
		System.out.println("Cercle 1 : périmètre : " + c1.calcPerim() + " surface : " + c1.calcSurf());
		System.out.println("Cercle 2 : périmètre : " + c2.calcPerim() + " surface : " + c2.calcSurf());
		
		Cercle c3 = CercleFactory.makeCercle(33.0d);
		System.out.println("Cercle 3 : périmètre : " + c3.calcPerim() + " surface : " + c3.calcSurf());
	}

}
