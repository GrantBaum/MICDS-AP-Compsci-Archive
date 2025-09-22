//libs
import java.util.*;


public class EPA03 {

	//this program contains reading from other files in the assignment details, but I dont really want to
	//because of that, were just gonna calculate the length of the collatz conjecture for each input
	//and im gonna use a scanner so sue me
	
	
	//for funzies, lets make collatz a method for easier use later
		public static int collatz(int userInput) {
			//initializing the count variable
			int count = 0;
			
			//creating our for loop
			for(int n = userInput; n > 1; count++) {
				
				//if the number is even
				if(n % 2 == 0) {
					try {
					n = n / 2;
					
					//make it say the number and count
					System.out.println("Current total: " + n + "  length: " + count);
					
					Thread.sleep(50);
					}
					catch(InterruptedException ex) {
						//do nothing
					}
				}
				
				//if the number is odd
				else if(n % 2 != 0) {
					try {
					n = (n*3) + 1;
					
					//make it say the number and count
					System.out.println("Current total: " + n + "  length: " + count);
					
					Thread.sleep(50);
					}
					catch(InterruptedException ex) {
						//do nothing
					}
					
			}
			}
			return count; //returning the length
			}
	
	public static void main(String[] args) {
		
		
		
		//starting variables
		int userInput;
		boolean looper = true;
		

		//scanner
		Scanner input = new Scanner(System.in);

		while(looper) {
			
			//since this isnt part of the autograded stuff, were gonna use try catch like a good human
			
			try {
				
				//getting user data
				System.out.print("Provide starting value: ");
				userInput = input.nextInt();
				
				//make sure its not negative
				if(userInput < 0) {
					
					System.out.println("Value must be posotive!");
					
					//continue the loop, ask them again
				}
				
				//its posotive, lets do math.
				else if(userInput > 0) {
					EPA03.collatz(userInput);
					
					//terminate the loop
					looper = false;
				}
				
				
			}
			catch(InputMismatchException e) {
				System.out.println("Value must be an integer!");
				
				//eat invalid input
				input.next();
			
				//continue ts loop so it asks them again
			}
		}
	}
		
}
