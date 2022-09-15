package main;

import java.util.Scanner;

public class inputUtilies {
	public static int getIntInput(Scanner input, int lowerbound, int upperbound) {
		boolean validInput = false;
		int returnVal = 0;
		while(!validInput) {
			System.out.println("please enter a valid integer from "+lowerbound+" to "+upperbound);
			try {
				int testVal = input.nextInt();
				if(testVal >= lowerbound && testVal <=upperbound) {
					returnVal=testVal;
					validInput = true;
				}else {
					System.out.println("Value out of bounds!");
					input.nextLine();
				}
			}catch(Exception e) {
				System.out.println("Please enter an integer value!");
				input.nextLine();
			}
		}
		
		return returnVal;
	}
}
