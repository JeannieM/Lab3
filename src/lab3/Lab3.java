package lab3;

/*
 * @author jeanniemccarthy
 */
import java.util.Scanner;
public class Lab3 {
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		int userInt;
		String userName;
		String goAgain = "y";
		
		System.out.println("Welcome to Jeannie's Even Odd Shenanigans! What shall we call you?");
		userName = scnr.nextLine();
		System.out.println("Excellent. Welcome " + userName + "! Let us begin...");
		while (goAgain.equalsIgnoreCase("y")) {
			System.out.println("Enter an integer between 1 and 100:");
			userInt = scnr.nextInt();
			
			while (userInt < 1 || userInt > 100) {
				System.out.println("Sorry, your entry is out of bounds. \nPlease enter an integer between 1 and 100:");
				userInt = scnr.nextInt();
			}
			
			System.out.println("Fantastic selection, " + userName + ", I dare say!");
		
			if (userInt % 2 != 0) {
				System.out.print(userInt + " Odd");
				if (userInt > 60) {
					System.out.print(" and over 60");
				}
				System.out.println(".");
			}
			
			else if (userInt >= 2 && userInt <= 25) {
				System.out.println("Even and less than 25.");
			}
			else if (userInt >= 26 && userInt <= 60) {
				System.out.println("Even");
			}
			else if (userInt > 60) {
				System.out.println(userInt + " Even.");
			}
			
			System.out.println("\nWould you like to go again? y/n");
			goAgain = scnr.next();
			
			while (!goAgain.equalsIgnoreCase("y") && !goAgain.equalsIgnoreCase("n")) {
				System.out.println("Sorry, please enter a \"y\" or an \"n\"...");
				System.out.println("\nWould you like to go again? y/n");
				goAgain = scnr.next();
			}
		}
		
		System.out.println("Thank you " + userName + "! You have made my day quite splendid. Fare thee well!");
		
		
		
	}

}
