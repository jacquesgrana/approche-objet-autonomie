package fr.diginamic.operations;

public class Operations {
	
	public static double calcul(double a, double b, char operateur) {
		double result = 0.0d;
		switch(operateur) {
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '*':
			result = a * b;
			break;
		case '/':
			if (b != 0.0d) {
				result = a / b;
			}
			else {
				System.out.println("Division par 0 !!");
				result = 0.0d;
			}
			break;
		}
		
		
		return result;
	}

}
