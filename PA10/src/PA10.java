//importing libs
import java.util.*;
public class PA10 {

	public static void main(String[] args) {
		
		//scanner
		Scanner input = new Scanner(System.in);
		
		//variables
		int count = 0;
		double sum = 0;
		double grade;
		double avg;
		boolean looper = true;
		
		//making the while loop
		while(looper) {
			
			//getting an input
			System.out.print("Please enter a grade (type a negative number to stop): ");
			grade = input.nextDouble();
			
			//logic for continuing
			if(grade > 0) {
				
				//add this grade to the sum and increase the count by 1
				sum += grade;
				count = count + 1;
				
				//dont terminate the loop
			}
			//logic for ending if user inputs grades
			else if(grade < 0 && count > 0) {
				
				//do the math
				avg = sum / count;
				System.out.println("Average grade is: " + Math.round(avg) + "%");
				
				//terminate the loop
				looper = false;
			}
			//logic in case first input is negative and loop terminates immediately
			else if(grade < 0 && count == 0) {
				
				System.out.println("No grades found.");
				
				//terminate the loop
				looper = false;
			}
		}
		
		

	}

}
