import java.util.Scanner;

/*
Name: Grant Baumstark
Block: F
Program: PA02
Date: 08/26/25
*/

public class PA03 {

	public static void main(String[] args) {
		
		double celciusoutput;
		int tempinput;
		
		Scanner scan = new Scanner(System.in); // Makes a scanner which takes input for temp
		
		System.out.print("Please give me a temperature in fahrenheit: "); // Lets the user know we are asking for an integer
		
		tempinput = scan.nextInt(); //ask user for farenheit
		
		celciusoutput = 0.5555555555555556*(tempinput - 32);
		
		System.out.println("The temperature in celsius is: " + celciusoutput);
		
		
		
		
		

	}
}
