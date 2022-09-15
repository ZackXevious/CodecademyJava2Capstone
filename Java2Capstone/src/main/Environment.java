package main;

import java.util.ArrayList;
import java.util.stream.Collectors;

import characters.*;

public class Environment {
	ArrayList<Human> humanForces;
	ArrayList<Alien> AlienForces;
	int numRounds;
	
	public Environment(int numHumans, int numAliens, int numRounds) {
		System.out.println("Creating new armies");
		//Instantiate both armies
		humanForces = new ArrayList<Human>();
		AlienForces = new ArrayList<Alien>();
		//Add new people to the fight!
		for(int x = 0; x < numHumans; x++){
			Human h = new Human();
			System.out.println("Adding human "+h.toString());
			humanForces.add(h);
		}
		//Add new aliens to the fight!
		for(int x = 0; x < numAliens; x++){
			Alien a = new Alien();
			System.out.println("Adding alien "+a.toString());
			AlienForces.add(a);
		}
		this.numRounds = numRounds;
	}
	
	public void updateBattleField() {
		for(int humans = 0; humans<humanForces.size(); humans++) {
			int alienToAttack = getRandomAlienIndex();
			AlienForces.get(alienToAttack).TakeDamage(humanForces.get(humans).getAttackStrength());
		}
		for(int aliens = 0; aliens<AlienForces.size(); aliens++) {
			int humanToAttack = getRandomHumanIndex();
			humanForces.get(humanToAttack).TakeDamage(AlienForces.get(aliens).getAttackStrength());
		}
		
		humanForces = (ArrayList<Human>) humanForces.stream().filter(human->human.getHealth()>0).collect(Collectors.toList());
		AlienForces = (ArrayList<Alien>) AlienForces.stream().filter(alien->alien.getHealth()>0).collect(Collectors.toList());
		this.numRounds -= 1;
		
	}
	
	public boolean checkStatus() {
		
		if(this.numRounds<=0 || humanForces.size()<=0 || AlienForces.size()<=0) {
			return true;
		}
		return false;
	}
	public int getRandomHumanIndex() {
		if(humanForces.size()==1) {
			return 0;
		}
		return (int) (Math.random()*humanForces.size());
	}
	public int getRandomAlienIndex() {
		if(AlienForces.size()==1) {
			return 0;
		}
		return (int) (Math.random()*AlienForces.size());
	}
	public String toString() {
		return "Humans: "+humanForces.size() + " -VS- " + "Aliens: "+AlienForces.size();
	}
	public String getWinner() {
		if(humanForces.size()>AlienForces.size()) {
			return "Humans win!";
		}else {
			return "Aliens win!";
		}
	}
}
