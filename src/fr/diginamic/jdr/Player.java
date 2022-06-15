package fr.diginamic.jdr;

public class Player {
	
	private String name;
	private int strength;
	private int life;
	private int score;
	
	/*
	public Player(String name, int strength, int life, int score) {
		this.name = name;
		this.strength = strength;
		this.life = life;
		this.score = score;
	}
	*/
	
	public Player(String name) {
		this.name = name;
		this.strength = (int) (12 + Math.round(6 * Math.random()));
		this.life = (int) (20 + Math.round(30 * Math.random()));
		this.score = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "name : " + this.name + " / strength : " + this.strength + " / life : " + this.life + " / score : " + this.score;
	}
	
}
