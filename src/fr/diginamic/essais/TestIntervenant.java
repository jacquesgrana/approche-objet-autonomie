package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		
		Salarie salar = new Salarie("Martin", "Martine", 3500.0d);
		System.out.println("Salarié : salaire : " + salar.getSalary());
		
		Pigiste pigist = new Pigiste("Dupond", "Jean", 60, 20.0);
		System.out.println("Pigiste : salaire : " + pigist.getSalary());
		
		System.out.println();
		
		
		salar.displayDatas();
		pigist.displayDatas();

	}

}
