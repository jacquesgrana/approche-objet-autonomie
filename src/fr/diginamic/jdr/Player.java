package fr.diginamic.jdr;

/**
 * Classe représentant un personnage du jeu
 * 
 * name : nom du personnage
 * strength : force du personnage
 * life : points de vie du personnage
 * score : score accumulé au cours du jeu
 * 
 * @author jacques
 */
public class Player {
	
	private String name;
	private int strength;
	private int life;
	private int score;
	
	/**
	 * Constructeur "automatique" à partir du nom du personnage choisi, construit de manière aléatoire l'objet
	 * @param name nom choisi par l'utilisateur
	 */
	public Player(String name) {
		this.name = name;
		this.strength = (int) (12 + Math.round(6 * Math.random()));
		this.life = (int) (20 + Math.round(30 * Math.random()));
		this.score = 0;
	}
	
	/**
	 * Construit un objet à zéro
	 */
	public Player() {
		this.name = "";
		this.strength = 0;
		this.life = 0;
		this.score = 0;
	}
	
	/**
	 * Raz de l'objet
	 */
	public void reset() {
		this.name = "";
		this.strength = 0;
		this.life = 0;
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
