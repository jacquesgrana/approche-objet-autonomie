package fr.diginamic.formes;

public class Rectangle extends Forme {

	private double length;
	private double width;
	
	
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateSurface() {
		return (this.length * this.width);
	}

	@Override
	public double calculatePerimetre() {
		return (2 * (this.length + this.width));
	}

}
