public class EPA00 {

	//METHOD 1 (desc in readme.txt)
	public static long factorial(int n) {
		
		long result = 1; //starting with 1
		
		//logic for if N is negative
		if(n < 0) {
			
			//throws exception if the input is negative
			throw new IllegalArgumentException("Factorial is not defined for negative numbers"); 	
		}
		
		//set logic for if n is 1 or 0
			if(n == 1 || n == 0) {
				
				return 1; // it will always equal one in these cases
			}
		
			//logic for if the number is not zero or 1
			else if(n > 1) {
				
				//starting the for loop (start value; end value; modifier)
				for(int i = n; i >= 1; i--) {
					result *= i; //result is 1, gets reset to i which is equal to the input, N
					//result continues to be reset and multiplied each time the loop runs, so it accumulates
				}
			}
			
			return result; //returns factorialed result
		}
	
	public static void main(String[] args) {
		// TEST CASES IF YOU WANT
		
		
		System.out.println("TESTING FOR METHOD 1");
		System.out.println("5! = " + factorial(5));  // Should be 120
	    System.out.println("4! = " + factorial(4));  // Should be 24
	    System.out.println("3! = " + factorial(3));  // Should be 6
	    //Test special cases
	    System.out.println("0! = " + factorial(0));  // Should be 1
	    System.out.println("1! = " + factorial(1));  // Should be 1
	 	//Test a larger number
	    System.out.println("13! = " + factorial(13));  // Should be 6227020800
	    
	}
	
}