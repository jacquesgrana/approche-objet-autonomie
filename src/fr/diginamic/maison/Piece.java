package fr.diginamic.maison;

public abstract class Piece {
	
	private double superficie;
	private int numeroEtage;
	private String type; // ajouté pour simplifier, enum?
	
	
	public Piece(double superficie, int numeroEtage, String type) {
		//super();
		// TODO ajouter test pour contrôler, ex numEtag >= 0, superficie > 0
		this.superficie = superficie;
		this.numeroEtage = numeroEtage;
		this.type = type;
	}


	public double getSuperficie() {
		return superficie;
	}


	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}


	public int getNumeroEtage() {
		return numeroEtage;
	}


	public void setNumeroEtage(int numeroEtage) {
		this.numeroEtage = numeroEtage;
	}

}
