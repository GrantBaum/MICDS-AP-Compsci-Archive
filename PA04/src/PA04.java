import java.util.Scanner;

/*
Name: Grant Baumstark
Block: F
Program: PA04
Date: 08/26/25
*/

public class PA04 {

	public static void main(String[] args) {
		
		//creating my scanner for the grades
		Scanner grader = new Scanner(System.in);
		
		        
		//defining starting variables
		double grade1;
		double grade2;
		double grade3;
		
		
		//user prompts
		System.out.print("Please give me the first grade: "); 
		grade1 = grader.nextDouble(); 
		System.out.print("Please give me the second grade: ");
		grade2 = grader.nextDouble();
		System.out.print("Please give me the third grade: ");
		grade3 = grader.nextDouble();
		
		//performing operations
		double sum = grade1 + grade2 + grade3;
		double average = (sum / 3);
		
		
		/* java will naturally round down when truncating, which is perfect
		 * because that means I will simply cast the double into an int and it
		 * will automatically round down for me
		 */
		

		//even though this function doesn't actually round, i'm just using the quirks to my advantage
		int roundedaverage = (int) average;
		
		
		//presents the data to the user
		System.out.println("The average of these grades are: " + roundedaverage + "%.");

	}

}
