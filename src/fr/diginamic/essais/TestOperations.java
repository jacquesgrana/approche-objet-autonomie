package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		double a = 0.5;
		double b = 5;
		
		System.out.println(a + " + " + b + " : " + Operations.calcul(a, b, '+') + "\n");
		System.out.println(a + " - " + b + " : " + Operations.calcul(a, b, '-') + "\n");
		System.out.println(a + " * " + b + " : " + Operations.calcul(a, b, '*') + "\n");
		System.out.println(a + " / " + b + " : " + Operations.calcul(a, b, '/') + "\n");

		System.out.println(a + " / " + 0 + " : " + Operations.calcul(a, 0.0d, '/') + "\n");
	}

}
