package fr.diginamic.salaire;

public abstract class Intervenant {
	
	private String name;
	private String firstName;
	private String status; // ajouté car solution la plus simple, utiliser enum
	
	
	public Intervenant(String name, String firstName, String status) {
		this.name = name;
		this.firstName = firstName;
		this.status = status;
	}
	
	public abstract double getSalary();
	
	public void displayDatas() {
		System.out.println("Nom : " + this.name + " / Prénom : " + this.firstName + " / Salaire : " + this.getSalary() + " / Status : " + this.status + "\n");
	}

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
