package fr.diginamic.formes;

public class Cercle extends Forme {
	
	private double radius;

	public Cercle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double calculateSurface() {
		return (Math.PI * this.radius * this.radius);
	}

	@Override
	public double calculatePerimetre() {
		return (2 * Math.PI * this.radius);
	}

}
