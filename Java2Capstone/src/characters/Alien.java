package characters;

public class Alien extends Entity {
	String planet;
	boolean bipedal;
	
	String [] planets = {"Earth 2", "Mars", "Balaho", "Sanghelios"};
	
	//Constructor
	public Alien(String name, int health, int attackStrength, String planet, boolean bipedal) {
		super(name, health, attackStrength);
		this.planet = planet;
		this.bipedal = bipedal;
	}
	public Alien() {
		// TODO Auto-generated constructor stub
		this.setName("Horde");
		this.setHealth(10);
		this.setAttackStrength((int)(Math.random()*9)+1);
		this.planet = planets[(int)(Math.random()*this.planets.length)];
		this.bipedal = ((int)(Math.random()*2))>0? true : false;
	}
}
