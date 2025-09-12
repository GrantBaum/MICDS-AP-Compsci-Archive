/*
Name: Grant Baumstark
Block: F
Program: PA05
Date: 08/28/25
*/

//imports, the first one is for my input validation
import java.util.InputMismatchException;
import java.util.Scanner;



public class PA05 {

	public static void main(String[] args) {
		
		//creating scanner for leash length input
				Scanner input = new Scanner(System.in);
				
				//defining starting variables
				double leashlength;
				double circlearea;
				double availArea;
				int roundedArea;
				double pi = 3.14159;
				boolean looper = true;
				
				//asking user for leash length
				
			
				
				
				//creating a while loop so that it will keep asking until valid input is entered
				while(looper) {
					
					
				//the try catch is gonna help me make sure the input is a valid number, and if not re prompt user
					try {
						System.out.print("Enter desired leash length (in feet): ");
						leashlength = input.nextDouble();
						
							//this if helps me decide if the number is negative, and if so re prompt user
							if (leashlength <= 0) {
								try {
								System.out.println("Animal abuse isn't cool. Please enter a value greater than zero.");
								
								//pausing for aesthetics
								Thread.sleep(1000);
								}
								
								//I have to handle the interupted exception error
								catch(InterruptedException ex) {
									//literally do nothing because who cares if it wakes up early
								}
							}
							
							//if the leash length is greater than zero then the program can continue
							else if (leashlength > 0){
								circlearea = ((leashlength * leashlength) * pi);
								
								
								/*
								splits the circle into quarters and then multiplies by three to get three quarters
								//since Toby only has three quarters of the circle to run and the other one is blocked
								by the house
								*/
								 availArea = ((circlearea / 4)*3);
								 
								 //then i need to round it using a math method
								 roundedArea = (int) Math.round(availArea);
								 
								 //prints final result rounded to nearest integer
								 System.out.print("Availible area is " + roundedArea + " ft^2");
								 
								 //terminating the loop
								 looper = false;
								
							}
							
							else {
								//if something really weird happens that the program and the checker doesnt catch
								System.out.println("UNKNOWN ERROR OCCURED");
								
								//not terminating loop here, i want it to restart until user enters valid data
							}
							
						}
				
				//if there is an invalid input error, this catches it and instead of crashing runs this code and restarts the loop
				catch (InputMismatchException e) {
					try {
					System.out.println("INVALID INPUT ERROR (NUMBERS ONLY)");
					
					//consumes the invalid input
					input.next();
					
					//pausing for aesthetics
					Thread.sleep(1000);
					}
					
					//I have to handle the interrupted exception error
					catch(InterruptedException ex) {
						//literally do nothing because who cares if it wakes up early
					}
					
					//not terminating loop here, i want it to restart until user enters valid data
				}
				
	

					

				}

	}

}
