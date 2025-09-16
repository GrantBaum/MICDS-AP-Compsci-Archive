
package csaMethods;

import java.util.*;

public class csaMethods {

	
	//THESE METHODS HELP WITH USER INPUT / CONSOLE OUPUT CODE EFFECIENCY
	class safeMethods {
		
		
			//THESE METHODS REQUIRES IMPORTING SCANNER
			//syntax is x = safeInt(scanner name, "prompt")
			public static int safeInt(Scanner scanner, String prompt) {
				
				while(true) {
					try {
						System.out.print(prompt);  //gets the user from the data by prompting them
						
						int value = scanner.nextInt();
						return value; //if we get here, it was already input correctly
					}
					catch(InputMismatchException e) {
						
						//User typed something like "abc" instead of a number
			            System.out.println("Invalid input. Please enter a whole number.");
			            scanner.nextLine();  // Clear the bad input from scanner
					}
				}
				 
			}
			
			public static int intInRangeN(Scanner scanner, String prompt, int min, int max) {
				
				while(true) {
					System.out.print(prompt); //gets user data by prompting them
					
					int value = scanner.nextInt();
					
					if(value > min && value < max) {
						return value;
					}
					else {
						throw new IllegalArgumentException("Data is outside of preset constraints");
					}
				}
			}
			
			//this one is inclusive
			public static int intInRangeI(Scanner scanner, String prompt, int min, int max) {
				
				while(true) {
					System.out.print(prompt); //gets user data by prompting them
					
					int value = scanner.nextInt();
					
					if(value >= min && value <= max) {
						return value;
					}
					else {
						throw new IllegalArgumentException("Data is outside of preset constraints");
					}
				}
			}
			
			//this one is for doubles
			public static double doubleInRangeN(Scanner scanner, String prompt, double min, double max) {
				
				while(true) {
					System.out.print(prompt); //gets user data by prompting them
					
					double value = scanner.nextDouble();
					
					if(value > min && value < max) {
						return value;
					}
					else {
						throw new IllegalArgumentException("Data is outside of preset constraints");
					}
				}
			}
			
			public static double doubleInRangeI(Scanner scanner, String prompt, double min, double max) {
				
				while(true) {
					System.out.print(prompt); //gets user data by prompting them
					
					double value = scanner.nextInt();
					
					if(value >= min && value <= max) {
						return value;
					}
					else {
						throw new IllegalArgumentException("Data is outside of preset constraints");
					}
				}
			}
			
			//#6
			//syntax is x = safeDouble(scanner name, "prompt")
			public static double safeDouble(Scanner scanner, String prompt) {
				
				while(true) {
					try {
						System.out.print(prompt);  //gets the user from the data by prompting them
						
						double value = scanner.nextDouble();
						return value; //if we get here, it was already input correctly
					}
					catch(InputMismatchException e) {
						
						//User typed something like "abc" instead of a number
			            System.out.println("Invalid input. Please enter a number.");
			            scanner.nextLine();  // Clear the bad input from scanner
					}
				}
			}
			
			//#7
			//syntax is x = safeString(scanner name, "prompt")
			public static String safeString(Scanner scanner, String prompt) {
			    while (true) {
			        System.out.print(prompt);
			        String input = scanner.nextLine().trim();  // Remove leading/trailing spaces
			        
			        if (input.isEmpty()) {
			            System.out.println("Input cannot be empty. Please try again.");
			            continue;
			        }
			        
			        return input;  // Valid non-empty string
			    }
			}
			
			
			//METHODS 8-11
			
			//#8
			public static int safeIntN(Scanner scanner, String prompt, int min, int max) {
				
				//while loop keeps running
				while(true) {
					try {
						
						System.out.print(prompt); //getting user input with prompt
						int value = scanner.nextInt();
						
						//sees if the input is within the range
						if(value < max && value > min) {
							return value; //this is what we want to happen! The data is within the range.
						}
						else {
							System.out.println("Invalid input. Data is outside preset constraints.");
						}
					}
					//catches exceptions just like the other one
					catch(InputMismatchException e) {
							System.out.println("Invalid input. Please enter a whole number.");
							
							scanner.next();//eat invalid input
						}
					}
				}
			
			//#9
			public static int safeIntI(Scanner scanner, String prompt, int min, int max) {
				
				//while loop keeps running
				while(true) {
					try {
						
						System.out.print(prompt); //getting user input with prompt
						int value = scanner.nextInt();
						
						//sees if the input is within the range (inclusive this time)
						if(value <= max && value >= min) {
							return value; //this is what we want to happen! The data is within the range.
						}
						else {
							System.out.println("Invalid input. Data is outside preset constraints.");
						}
					}
					//catches exceptions just like the other one
					catch(InputMismatchException e) {
							System.out.println("Invalid input. Please enter a whole number.");
							
							scanner.next();//eat invalid input
						}
					}
				}
			
			//#10
			public static double safeDoubleN(Scanner scanner, String prompt, double min, double max) {
		
				//while loop keeps running
				while(true) {
					try {
						
						System.out.print(prompt); //getting user input with prompt
						double value = scanner.nextDouble();
				
						//sees if the input is within the range
						if(value < max && value > min) {
							return value; //this is what we want to happen! The data is within the range.
						}
						else {
							System.out.println("Invalid input. Data is outside preset constraints.");
						}
					}
					//catches exceptions just like the other one
					catch(InputMismatchException e) {
						System.out.println("Invalid input. Please enter a number.");
						
						scanner.next();//eat invalid input
					}
				}
			}
			
			//#11
			public static double safeDoubleI(Scanner scanner, String prompt, double min, double max) {
				
				//while loop keeps running
				while(true) {
					try {
						
						System.out.print(prompt); //getting user input with prompt
						double value = scanner.nextDouble();
				
						//sees if the input is within the range (inclusive this time)
						if(value <= max && value >= min) {
							return value; //this is what we want to happen! The data is within the range.
						}
						else {
							System.out.println("Invalid input. Data is outside preset constraints.");
						}
					}
					//catches exceptions just like the other one
					catch(InputMismatchException e) {
						System.out.println("Invalid input. Please enter a number.");
						
						scanner.next();//eat invalid input
					}
				}
			}
			
			//QUICK PRINT METHODS
			public static String print(String input) {
				System.out.print(input); //prints input
				return input; //returns the input so it doesnt get mad
			}
			
			public static String println(String input) {
				System.out.println(input); //prints input with newline
				return input; //returns the input so it doesnt get mad
			}
			
			
			
			//THESE METHODS DO SOME COOL MATH
			class mathMethods {

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
				
				
				//METHOD 2 (desc in readme.txt)
				public static int gcd(int a, int b) {

					// Make both positive in case inputs are negative
				    a = Math.abs(a);
				    b = Math.abs(b);
				   
					if (b == 0) {
						
					    return a;  //When b becomes 0, a is answer
					}
					
					else {
						
						//call this function recursively
						return gcd(b, a % b);
					}
				}
				
				
				//METHOD 3 (desc in readme.txt)
				public static int lcm(int a, int b) {
					
				    if (a == 0 || b == 0) {
				    	throw new IllegalArgumentException("Cannot input 0 for LCM calculation");
				    }
				    
				    //calling my gcd function that i already made
				    return (int)(Math.abs((long)a * b) / gcd(a, b)); //using long in case the multiplication makes numbers too big
				}
				
				//METHOD 4 (desc in readme.txt)
				public static boolean isPrime(int n) {
					
					// Handle special cases first
				    if (n <= 1) return false;  //0, 1, negatives
				    if (n == 2) return true;   //2 is the only even prime
				    if (n % 2 == 0 && n != 2) return false; //All other even numbers
				    
				    for (int i = 3; i <= Math.sqrt(n); i += 2) {  // Only odd numbers
				        if (n % i == 0) {
				            return false;  //Found a divisor - not prime!
				        }
				    }
				    return true;  //Made it through without finding divisors - is prime!
				}
			}
	}
	
	
	//THESE METHODS CAN PLAY WITH ARRAYS
	class arrayMethods{
		//#12
		public static int countOccurrences(int[] array, int target) {
		    int count = 0; //starts count at 0
		    for (int num : array) {
		    	//if theyre equal we win
		        if (num == target) {
		            count++;
		        }
		    }
		    //returns the total count
		    return count;
		}
		
		//#13
		public static int countOccurrences(double[] array, double target) {
		    int count = 0; //starts count at 0
		    for (double num : array) {
		    	//if theyre equal we win
		        if (num == target) {
		            count++;
		        }
		    }
		  //returns the total count
		    return count;
		}
		
		//#14
		public static int countOccurrences(String[] array, String target) {
		    int count = 0; //starts count at 0
		    for (String word : array) {
		    	//if theyre equal we win
		        if (word == target) {
		            count++;
		        }
		    }
		  //returns the total count
		    return count;
		}
		    
		
		//averaging of array
		public static double arrayAvg(int[] array) {
			
			double sum = 0; //initializing the sum to store adding
			
			for(int num : array) {
				sum += num;
			}
			return sum / array.length; //our answer
		}
		
		public static double arrayAvg(double[] array) {
			
			double sum = 0; //initializing the sum to store adding
			
			for(double num : array) {
				
				sum += num;
			}
			
			return sum / array.length; //our answer
		}
		
		//sorting algorithms of arrays
		public static void sort(int[] array) {
			
		    Arrays.sort(array); // uses dual-pivot quicksort for primitives
		}

		public static void sort(double[] array) {
			
		    Arrays.sort(array);
		}
		
		//methods for finding median
	    public static double arrayMedian(int[] array) {
	    	sort(array);
	    	int n = array.length;
	    	
	    	if (n % 2 == 0) {
	    		
	    		return (array[n / 2 - 1] + array[n / 2]) / 2.0;
	    	} 		
	    	else {
	    		
	    		return array[n / 2];
	    	}
	    }

	    public static double arrayMedian(double[] array) {
	    	sort(array);
	    	int n = array.length;
	    	
	    	if (n % 2 == 0) {
	    		return (array[n / 2 - 1] + array[n / 2]) / 2.0;
	    	} 
	    	
	    	else {
	    		return array[n / 2];
	    	}
	    }
		    
		    //METHODS FOR FINDING MODE
		public static int arrayMode(int[] array) {
			
		    	HashMap<Integer, Integer> freqMap = new HashMap<>();
		    	for (int num : array) {
		    		freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
		    	}
		    	
		    int mode = array[0];
		    int maxCount = 0;
		    
		    	for (int key : freqMap.keySet()) {
		    		if (freqMap.get(key) > maxCount) {
		    			maxCount = freqMap.get(key);
		    			mode = key;
		    		}
		    	}
		    	return mode;
		    }
		

		public static double arrayMode(double[] array) {
			
		    HashMap<Double, Integer> freqMap = new HashMap<>();
		    
		    for (double num : array) {
		    	freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
		    }
		    
		    double mode = array[0];
		    int maxCount = 0;
		    
		    	for (double key : freqMap.keySet()) {
		    		if (freqMap.get(key) > maxCount) {
		    			maxCount = freqMap.get(key);
		    			mode = key;
		    		}
		    	}
		    	return mode;
		    }

		public static String arrayMode(String[] array) {
			
		    HashMap<String, Integer> freqMap = new HashMap<>();
		    
		    for (String str : array) {
		    	freqMap.put(str, freqMap.getOrDefault(str, 0) + 1);
		    }
		    
		    String mode = array[0];
		    int maxCount = 0;
		    
		    for (String key : freqMap.keySet()) {
		    	if (freqMap.get(key) > maxCount) {
		    		maxCount = freqMap.get(key);
		    		mode = key;
		    	}
		    }
		    return mode;
		    }

		}
	
	public static void main(String args[]) {
		//nothing here
	}
}
