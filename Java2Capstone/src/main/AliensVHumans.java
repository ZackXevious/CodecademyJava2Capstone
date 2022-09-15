package main;

import java.util.Scanner;

public class AliensVHumans {
	public static void main(String [] args) {
		
		System.out.println("Aliens vs Humans");
		Scanner input = new Scanner(System.in);
		boolean play = true;
		while(play) {
			int numHumans, numAliens, numRounds;
			System.out.println("Enter the number of Humans");
			numHumans = inputUtilies.getIntInput(input, 0, 50);
			System.out.println("Enter the number of Aliens");
			numAliens = inputUtilies.getIntInput(input, 0, 50);
			System.out.println("Enter the number of Rounds to fight");
			numRounds = inputUtilies.getIntInput(input, 0, 10);
			System.out.println("Creating new battlefield with settings");
			Environment battlefield = new Environment(numHumans,numAliens,numRounds);
			
			do {
				battlefield.updateBattleField();
				System.out.println(battlefield.toString());
			} while(!battlefield.checkStatus());
			
			System.out.println("Fight is over");
			System.out.println(battlefield.getWinner());
			
			System.out.println("Play Again?");
			char answer = input.next().toLowerCase().charAt(0);
			if(answer != 'y') {
				play=false;
			}
		}
		System.out.println("Thanks for playing!");
		
	}

}
