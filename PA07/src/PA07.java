/*
Name: Grant Baumstark
Block: F
Program: PA06
Date: 09/07/25
*/

import java.util.Scanner;

public class PA07 {

	public static void main(String[] args) {
		
		//creating the scanner
		Scanner input = new Scanner(System.in);
		
		//i could probobly code this with the if else thing, but the arrays are helpful and i wanna practice
		String[] response = {"Backing Up?", "No Ticket", "A Small Ticket", "A Big Ticket"};
		
		//prompting for user input
		System.out.print("Sir, what speed were you going? "); 
		int speed = input.nextInt();
		
		//closing scanner to free up rescources since it isnt used anymore
		input.close();

		//logic for ticket giving
		if (speed < 0) {
			System.out.println(response[0]);
		}
		else if (speed >= 0 && speed <= 60) {
			System.out.println(response[1]);
		}
		else if (speed >= 61 && speed <= 80) {
			System.out.println(response[2]);
		}
		else {
			System.out.println(response[3]);
		}
	}

}
