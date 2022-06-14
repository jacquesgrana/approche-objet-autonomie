package fr.diginamic.salaire;

public abstract class Intervenant {
	
	private String name;
	private String firstName;
	
	
	public Intervenant(String name, String firstName) {
		//super();
		this.name = name;
		this.firstName = firstName;
	}
	
	public abstract double getSalary();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
