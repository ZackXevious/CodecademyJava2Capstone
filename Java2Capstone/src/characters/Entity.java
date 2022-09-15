package characters;

public class Entity {
	String name;
	int health;
	int attackStrength;
	public Entity() {
		this.name = "";
		this.health = 0;
		this.attackStrength = 0;
	}
	public Entity(String name, int health, int attackStrength) {
		this.name = name;
		this.health = health;
		this.attackStrength = attackStrength;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getAttackStrength() {
		return attackStrength;
	}

	public void setAttackStrength(int attackStrength) {
		this.attackStrength = attackStrength;
	}
	public void TakeDamage(int value) {
		this.health-=value;
	}
	public String toString() {
		return this.name+", attack power "+this.attackStrength+", starting health:"+this.health;
	}
}
