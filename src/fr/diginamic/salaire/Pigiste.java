package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

	private int dayNumber;
	private double daySalary;
	
	public Pigiste(String name, String firstName, int dayNumber, double daySalary) {
		super(name, firstName);
		this.dayNumber = dayNumber;
		this.daySalary = daySalary;
	}

	@Override
	public double getSalary() {
		return (this.dayNumber * this.daySalary);
	}

}
