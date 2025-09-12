//Name: Grant Baumstark

//needed libs
import java.util.Scanner;

public class PA08 {

	public static void main(String[] args) {
		
		//declaring variables
		int first;
		int second;
		int third;
		
		//making scanner
		Scanner input = new Scanner(System.in);
		
		//getting user inputs
		System.out.print("Please give me the first number: ");
		first = input.nextInt();
		System.out.print("Please give me the second number: ");
		second = input.nextInt();
		System.out.print("Please give me the third number: ");
		third = input.nextInt();
		
		//logic for increasing or descending
		if (first > second && second > third) {
			System.out.println("Decreasing Order");
		}
		else if (first < second && second < third) {
			System.out.println("Increasing Order");
		}
		else {
			System.out.println("Neither");
		}
		
		
	}

}
