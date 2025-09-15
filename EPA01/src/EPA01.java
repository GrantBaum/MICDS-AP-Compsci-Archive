import java.util.Scanner;
import java.util.InputMismatchException;

//for rounding down to certain decimal places, not required for AP at the moment
import java.math.BigDecimal;
import java.math.RoundingMode;

public class EPA01 {

	public static void main(String[] args) {
		//creating scanner
		Scanner input = new Scanner(System.in);
		
		
		//looping variable
		boolean looper = true;
		//variables
		double distance; //distance traveled
		double velocity; //initial velocity
		double time; //time traveled
		double accel; //initial acceleration
		
while(looper)		{
	try {
		//user inputs
		System.out.print("Enter velocity: ");
		velocity = input.nextDouble();
		System.out.print("Enter acceleration: ");
		accel = input.nextDouble();
		System.out.print("Enter time: ");
		time = input.nextDouble();
		
		//logic for making sure inputs are within range
				if (velocity >= -100 && velocity <= 100) {
					if (accel >= -100 && accel <= 100) {
						if (time >= -100 && time <= 100) {
							//d = vt + (1/2)(at^2)
							distance = (velocity*time) + (.5 * (accel * (time*time)));
							
							//rounding to big decimal
							BigDecimal bd = new BigDecimal(Double.toString(distance));
							bd = bd.setScale(4, RoundingMode.HALF_UP);
							double roundedDistance = bd.doubleValue();
							
							//printing with the rounded distance
							System.out.println("Distance was " + roundedDistance);
						}
						else {
							System.out.println("ERROR");
						}
					}
						else {
							System.out.println("ERROR");
						}
					}
					else {
						System.out.println("ERROR");
				}

		//if everything happens right then the loop ends so the code doesnt run again
		looper = false;
		
	}
	//catching invalid inputs
	catch(InputMismatchException e) {
	
		//has to be in a try cause we have to catch the interupted exception
		try {
			
		//say there was something wrong
		System.out.println("ERROR! INVALID INPUT!");
		
		//eating invalid input
		input.next();
		
		Thread.sleep(1000); //length in miliseconds
		}
		catch(InterruptedException ex) {
			//literally dont even need to do anything
		}
	}
	}
}
}
	


