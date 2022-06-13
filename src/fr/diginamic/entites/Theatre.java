package fr.diginamic.entites;

public class Theatre {
	
	private String name;
	private int maxCapacity;
	private int nbInscription;
	private double totalIncome;
	
	
	public Theatre(String name, int maxCapacity, int nbInscription, double totalIncome) {
		//super();
		this.name = name;
		this.maxCapacity = maxCapacity;
		this.nbInscription = nbInscription;
		this.totalIncome = totalIncome;
	}
	
	public void inscrire(int nbCostumer, double price) {
		
		if (nbCostumer + this.nbInscription <= this.maxCapacity) {
			this.nbInscription += nbCostumer;
			this.totalIncome += nbCostumer*price;
		}
		else {
			System.out.println("Thêatre plein !\n");
		}
	}

	public String getName() {
		return name;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public int getNbInscription() {
		return nbInscription;
	}

	public double getTotalIncome() {
		return totalIncome;
	}
	
	
	

}
