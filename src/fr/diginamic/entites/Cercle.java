package fr.diginamic.entites;

public class Cercle {
	
	private double radius;

	public Cercle(double radius) {
		//super();
		this.radius = radius;
	}
	
	public double calcPerim() {
		return (2*Math.PI*this.radius);
	}
	
	public double calcSurf() {
		return (Math.PI*this.radius*this.radius);
	}

}
