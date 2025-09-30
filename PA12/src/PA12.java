/*
Name: Grant Baumstark
Block: F
Program: PA12
Date: 9/30/25
*/

public class PA12 {


	public static boolean sleepIn(boolean weekday, boolean vacation) {
		
		//if you are on vacation or its not a weekday, sleep in
		if(vacation || !weekday) {
			return true; 
		}
		
		//otherwise, dont.
		else {
			return false;
		}
	}


	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

		//both of them are smiling or both are not
		if((aSmile && bSmile) || (!aSmile && !bSmile)){
			return true; //we in trouble
		}
		
		//otherwise, only one is smiling
		else {
			return false; //we arent in trouble
		}
	}


	public static boolean lastDigit(int a, int b) {
		
		//if the last digit of a is equal to last digit of b, its true
		if(Math.abs(a) % 10 == Math.abs(b) % 10) {
			return true;
		}
		
		//otherwise, its false
		else {
			return false;
		}
	}


	public static int diffTwentyOne(int n) {
		
		//if it is greater than 21, get the absolute difference times two
		if(n > 21) {
			return Math.abs((n-21)*2);
		}
		
		//otherwise, get the absolute difference
		else {
			return Math.abs(n-21);
		}
	}


	public static int sumDouble(int a, int b) {
		
		//if theyre the same
		if(a == b) {
			return (a+b)*2; //double the sum
		}
		
		//otherwise
		else {
			return a+b; //just the sum
		}
	}


	public static int closeTen(int a, int b) {
		
		//if a diff is smaller, a is closer
		if (Math.abs(a - 10) < Math.abs(b - 10)) {
			return a; //a wins
		}
		//if b diff is smaller, b is closer
		else if (Math.abs(a - 10) > Math.abs(b - 10)) {
			return b; //b wins
		}
		//otherwise theyre equal and its a tie
		else {
			return 0;
		}
	}


	public static boolean loneTeen(int a, int b) {
		
		//if one of the variables is a teen
		//^ is the xor, or exclusive or, returns true only if one variable is true. If both are true or false its false.
		if ((a >= 13 && a <= 19) ^ (b >= 13 && b <=19)) {
			return true;
		}
		
		//otherwise
		else {
			return false;
		}
	}


	public static boolean threeOrFive(int n) {
		
		//divisible by 3 or 5 because remainder is 0
		if((Math.abs(n) % 3 == 0) || (Math.abs(n) % 5 == 0)) {
			return true;
		}
		
		//otherwise its false
		else {
			return false;
		}
	}


	public static boolean squirrelPlay(int temp, boolean isSummer) {
		
		//if its summer
		if(isSummer && temp >= 60 && temp <= 100) {
			return true;
		}
		
		//if its not summer then see if its this
		else if(temp >= 60 && temp <= 90) {
			return true;
		}
		
		//if neither apply then return false
		else {
			return false;
		}
	}


	public static int sumDigits(int n) {
		
		int sum = 0;
		
		//handle negative numbers by converting to posotive
		n = Math.abs(n);
		
		while(n != 0) {
			
			//get the last digit
			int digit = n % 10;
			
			//add this digit to the sum
			sum += digit;
			
			//remove the last digit with integer division and truncation
			n /= 10;
		}
		return sum; //return the sum
	}


	public static int countEvens(int n) {
		
		int count = 0;
		
		//handling negatives
		n = Math.abs(n);
	
		//0 is even i suppose
		if(n == 0) {
			return 1;
		}
		
		//the number isnt 0
		else {
			
			while(n != 0) {
			
				//get last digit
				int digit = n % 10;
			
				//check if its even
				if(digit % 2 == 0) {
					count++; //add one to the count
				}
				else {
					//do nothing
				}
			
				//remove last digit with int division
				n /= 10;
			}
		}
		return count; //return the count
	}


	public static int largestNum(int n) {
		int bigNum = 0;
		
		//handling negatives
		n = Math.abs(n);
		
		while(n != 0) {
			
			//get last digit
			int digit = n % 10;
			
			if(digit > bigNum) {
				bigNum = digit; //set the biggest number to the new biggest diit
			}
			else {
				//do nothing
			}
			
			//remove last digit with int division
			n /= 10;
		}
		return bigNum;
	}
	
	public static void main(String[] args) {
		// All of the following below are examples on how to call the methods above
		// In order to test to see what a method does.. you have to change the below
		// lines to reflect it
		System.out.println("sleepIn(false,false) --> " + sleepIn(false, false));
		System.out.println("monkeyTrouble(true, true) --> " + monkeyTrouble(true, true));
		System.out.println("lastDigit(7, 17)--> " + lastDigit(7, 17));
		System.out.println("diffTwentyOne(19) --> " + diffTwentyOne(19));
		System.out.println("sumDouble(1, 2) --> " + sumDouble(1, 2));
		System.out.println("closeTen(8, 13) --> " + closeTen(8, 13));
		System.out.println("loneTeen(8, 13) --> " + loneTeen(8, 13));
		System.out.println("threeOrFive(3) --> " + threeOrFive(3));
		System.out.println("squirrelPlay(70,false) --> " + squirrelPlay(70, false));
		System.out.println("sumDigits(5) --> " + sumDigits(5));
		System.out.println("countEvens(0) --> " + countEvens(0));
		System.out.println("largestNum(5) --> " + largestNum(5));

	}
}