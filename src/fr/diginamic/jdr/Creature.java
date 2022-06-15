package fr.diginamic.jdr;

public class Creature {
	
	private String type;
	private int strength;
	private int life;
	private int loot;
	
	public Creature(String type) {
		this.type = type;
		switch (type) {
		case "Wolf" :
			this.strength = (int) (3 + Math.round(5 * Math.random()));
			this.life = (int) (5 + Math.round(5 * Math.random()));
			this.loot = 1;
			break;
		case "Gobelin" :
			this.strength = (int) (5 + Math.round(5 * Math.random()));
			this.life = (int) (10 + Math.round(5 * Math.random()));
			this.loot = 2;
			break;
		case "Troll" :
			this.strength = (int) (30 + Math.round(5 * Math.random()));
			this.life = (int) (20 + Math.round(10 * Math.random()));
			this.loot = 5;
			break;
		default :
			this.strength = 0;
			this.life = 0;
			this.loot = 0;
			break;
		
		}
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public int getLoot() {
		return loot;
	}

	public void setLoot(int loot) {
		this.loot = loot;
	}

	@Override
	public String toString() {
		return "type : " + this.type + " / strength : " + this.strength + " / life : " + this.life + " /  loot : " + this.loot;
	}
	
	
}
