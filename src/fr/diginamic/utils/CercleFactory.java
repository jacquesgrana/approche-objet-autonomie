package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleFactory {
	
	public static Cercle makeCercle(double radius) {
		return new Cercle(radius);
	}

}
