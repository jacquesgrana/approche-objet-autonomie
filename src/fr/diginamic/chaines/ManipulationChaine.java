package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine = "Durand;Marcel;2 523.5";
		
		char firstChar = chaine.charAt(0);
		System.out.println("Premier caractère: " + firstChar);

		System.out.println("Longueur de la chaîne : " + chaine.length());
		
		int index = chaine.indexOf(";");
		System.out.println("Index du 1e ';' : " + index);
		
		String name = chaine.substring(0, chaine.indexOf(";"));
		
		System.out.println("Nom : " + name);
		
		System.out.println("Nom en majuscules : " + name.toUpperCase());
		System.out.println("Nom en minuscules : " + name.toLowerCase());
		
		String[] tabString = chaine.split(";");
		String extrName = tabString[0];
		String extrFisrtName = tabString[1];
		String extrSalary = tabString[2];
		
		extrSalary = extrSalary.replace(" ", "");
		
		System.out.println("\nAprès extraction: nom : " + extrName + " prénom : " + extrFisrtName + " salaire : " + extrSalary);
		
		Salarie mySalarie = new Salarie(extrName, extrFisrtName, Double.parseDouble(extrSalary));
		
	}

}
