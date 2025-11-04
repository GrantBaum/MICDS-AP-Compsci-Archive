/*
 * Name: 
 * Block: 
 * Program: PA14
 * Date: 
 */

import java.util.Scanner;

public class PA14 {

	/*
	 * - String myString: source String - String searchString: which
	 * word/phrase/character to replace - String newString: replacement
	 * word/phrase/character
	 */
	
		
	public static String replaceWords(String myString, String searchString, String newString) {

		String result = "";
		int start = 0;
		int index = myString.indexOf(searchString);

		while (index != -1) {
		// Add everything before the found word
		result += myString.substring(start, index);
		// Add the replacement word
		result += newString;
		// Move start to the end of the found word
		start = index + searchString.length();
		// Look for the next occurrence
		index = myString.indexOf(searchString, start);
		}

		// Add whatever is left after the last replacement
		result += myString.substring(start);

		return result;
		}


	public static String replaceWord(String myString, String searchString, String newString, int n) {
		int count = 0;
		int index = 0;

		while ((index = myString.indexOf(searchString, index)) != -1) {
		count++;

		if (count == n) {
		// Found the nth occurrence
		return myString.substring(0, index) + newString + myString.substring(index + searchString.length());
		}
		index += 1; // move forward by 1 to allow overlaps
		}

		// Didn't find nth occurrence so return unchanged
		return myString;
	}

	
	/* The following main method is to help you test your code. It will not be graded. */
	public static void main(String[] args) {
		String test1 = replaceWord("hello world hello", "hello", "hi", 1);
		String test2 = replaceWord("hello world hello", "hello", "hi", 2);
		String test3 = replaceWord("hello world", "hello", "hi", 2);
		String test4 = replaceWord("banana", "ana", "bbb", 2);
		String test5 = replaceWord("banana", "ana", "bbb", 1);
		String test6 = replaceWord("ababa", "a", "x", 2);
		String test7 = replaceWord("ababa", "a", "x", 3);
		String test8 = replaceWord("hello", "hello", "hi", 0);
		String test9 = replaceWord("hello", "hello", "hi", -1);
		String test10 = replaceWord("the cat in the hat sat on the mat", "the", "a", 2);
		String test11 = replaceWord("hello world hello", "hello", "", 1);
		String test12 = replaceWords("hello world hello", "hello", "hi");
		String test13 = replaceWords("hello world", "goodbye", "farewell");
		String test14 = replaceWords("hello world hello", "hello", "");
		String test15 = replaceWords("banana", "a", "o");
		String test16 = replaceWords("banana", "ana", "bbb");
		String test17 = replaceWords("test", "test", "passed");
		String test18 = replaceWords("cat dog cat", "cat", "elephant");
		String test19 = replaceWords("Hello hello HELLO", "hello", "hi");
		String test20 = replaceWords("I am happy", "am", "am very");
		
		if(test1.equals("hi world hello")) {
			System.out.println("Test 1 Passed!");
		}
		else System.out.println("Test 1 failed.");
		
		if(test2.equals("hello world hi")) {
			System.out.println("Test 2 Passed!");
		}
		else System.out.println("Test 2 failed.");
		
		if(test3.equals("hello world")) {
			System.out.println("Test 3 Passed!");
		}
		else System.out.println("Test 3 failed.");
		
		if(test4.equals("banbbb")) {
			System.out.println("Test 4 Passed!");
		}
		else System.out.println("Test 4 failed.");
		
		if(test5.equals("bbbbna")) {
			System.out.println("Test 5 Passed!");
		}
		else System.out.println("Test 5 failed.");
		
		if(test6.equals("abxba")) {
			System.out.println("Test 6 Passed!");
		}
		else System.out.println("Test 6 failed.");
		
		if(test7.equals("ababx")) {
			System.out.println("Test 7 Passed!");
		}
		else System.out.println("Test 7 failed.");
		
		if(test8.equals("hello")) {
			System.out.println("Test 8 Passed!");
		}
		else System.out.println("Test 8 failed.");
		
		if(test9.equals("hello")) {
			System.out.println("Test 9 Passed!");
		}
		else System.out.println("Test 9 failed.");
		
		if(test10.equals("the cat in a hat sat on the mat")) {
			System.out.println("Test 10 Passed!");
		}
		else System.out.println("Test 10 failed.");
		
		if(test11.equals(" world hello")) {
			System.out.println("Test 11 Passed!");
		}
		else System.out.println("Test 11 failed.");
		
		if(test12.equals("hi world hi")) {
			System.out.println("Test 12 Passed!");
		}
		else System.out.println("Test 12 failed.");
		
		if(test13.equals("hello world")) {
			System.out.println("Test 13 Passed!");
		}
		else System.out.println("Test 13 failed.");
		
		if(test14.equals(" world ")) {
			System.out.println("Test 14 Passed!");
		}
		else System.out.println("Test 14 failed.");
		
		if(test15.equals("bonono")) {
			System.out.println("Test 15 Passed!");
		}
		else System.out.println("Test 15 failed.");
		
		if(test16.equals("bbbbna")) {
			System.out.println("Test 16 Passed!");
		}
		else System.out.println("Test 16 failed.");
		
		if(test17.equals("passed")) {
			System.out.println("Test 17 Passed!");
		}
		else System.out.println("Test 17 failed.");
		
		if(test18.equals("elephant dog elephant")) {
			System.out.println("Test 18 Passed!");
		}
		else System.out.println("Test 18 failed.");
		
		if(test19.equals("Hello hi HELLO")) {
			System.out.println("Test 19 Passed!");
		}
		else System.out.println("Test 19 failed.");
		
		if(test20.equals("I am very happy")) {
			System.out.println("Test 20 Passed!");
		}
		else System.out.println("Test 20 failed.");
		
		
}
}