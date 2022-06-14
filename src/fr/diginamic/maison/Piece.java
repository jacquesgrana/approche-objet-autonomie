package fr.diginamic.maison;

public abstract class Piece {
	
	private double superficie;
	private int numeroEtage;
	private String type; // ajouté pour simplifier, enum?
	
	
	public Piece(double superficie, int numeroEtage, String type) {
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


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

}
