package fr.diginamic.operations;

public class CalculMoyenne {
	
	private double[] tab;

	public CalculMoyenne(double[] tab) {
		//super();
		this.tab = tab;
	}
	
	public void ajout(double valToAdd) {
		double[] tempTab = new double[this.tab.length+1];
		for (int i=0; i<tab.length; i++) {
			tempTab[i] = this.tab[i];
		}
		tempTab[tab.length] = valToAdd;
		this.tab = tempTab;
	}

	public double calcul() {
		double valToReturn = 0.0d;
		for (int i=0; i<this.tab.length; i++) {
			valToReturn += this.tab[i];
		}
		valToReturn = valToReturn / this.tab.length;
		return valToReturn;
	}
}
