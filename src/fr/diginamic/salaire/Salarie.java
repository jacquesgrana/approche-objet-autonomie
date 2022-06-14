package fr.diginamic.salaire;

public class Salarie extends Intervenant {

	private double monthSalary;
	
	
	public Salarie(String name, String firstName, double monthSalary) {
		super(name, firstName);
		this.monthSalary = monthSalary;
	}


	@Override
	public double getSalary() {
		return this.monthSalary;
	}

}
