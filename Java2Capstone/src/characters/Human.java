package characters;

public class Human extends Entity {
	String country;
	int rank;
	String[] FirstNames = {"Steve", "Bob", "Jill", "Joe", "Alex", "Mitch", "Sonic"};
	String[] LastNames = {"Johnson", "Stevenson", "Hedgeburg", "Kirkman", "Goodman", "Goldstein", "Edgehog"};
	String[] Countries = {"USA", "Canada", "UK", "Germany", "Japan", "Australia", "India"};
	public Human() {
		this.setName(generateName());
		this.setHealth(10);
		this.setAttackStrength((int)(Math.random()*9)+1);
		this.country = Countries[(int)(Math.random()*this.Countries.length)];
		this.rank = (int)(Math.random()*9)+1;
	}
	public Human(String name, int health, int attackStrength, String country, int rank) {
		super(name, health, attackStrength);
		this.country = country;
		this.rank = rank;
	}
	
	public String generateName() {
		String returnStr = "";
		returnStr += FirstNames[(int)(Math.random()*this.FirstNames.length)];
		returnStr += " ";
		returnStr += LastNames[(int)(Math.random()*this.LastNames.length)];
		return returnStr;
	}
	public String toString() {
		
		return super.toString() + ", country: "+this.country+", rank: "+this.rank;
	}

}
