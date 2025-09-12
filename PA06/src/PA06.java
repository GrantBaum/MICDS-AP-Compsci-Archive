/*
Name: Grant Baumstark
Block: F
Program: PA06
Date: 09/07/25
*/

import java.util.Scanner;


public class PA06 {

	public static void main(String[] args) {
	

		//scanner for use input
		Scanner input = new Scanner(System.in);
		
		//making the array that stores days of the week
		String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		

			//asking user for input
			System.out.print("Please give me a number for the day of the week: ");
			int day = input.nextInt();
			
			//since the indexing of the array starts at 0, we need to do some funky stuff to protect from
			//bad inputs while also returning the correct input and compensating for the weird indexing
			if (day > 0 && day <= 7) {
				
				//because the indexing starts at zero so it will be one behind the input
				day = day - 1;
				
				//fetching from the array
				System.out.println(weekdays[day]);
				
			}
			else {
				System.out.println("ERROR");
			}
			
	

}
}