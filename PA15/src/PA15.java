import java.util.*;
public class PA15 {

	public static String removeSpecialChars(String input){

		int arrayIndex = 0; //counting up through the list of special charecters in the array
		int stringIndex = 0; //where the charecter appears in the string
		int position = 0; //where our metaphorical cursor is in the string we are modifying
		String result = ""; //empty result string


		//array of special chars
		String specialChars[] = {" ", "-", "(", ")", "."};

		//keeps searchign until every char has been looked through
		while(arrayIndex <= 4){
		    
		    //puts our index where we want it
		    stringIndex = input.indexOf(specialChars[arrayIndex]);

		    //searches each individual char until there are no instances left
		    while(stringIndex != -1){

		        result += input.substring(position, stringIndex);

		        position = stringIndex + 1;

		        // Look for the next occurrence
				stringIndex = input.indexOf(specialChars[arrayIndex], position);

		    }

		    result += input.substring(position);
		    position = 0;
		    input = result;
		    result = "";
		    
		    
		    //change
		    arrayIndex++;
		}
		return input;
	}
	
	
	
	public static boolean checkIfOnlyNums(String number) {
		
		try {
			long x = Long.parseLong(number);
			
			return true;
		}
		catch(NumberFormatException e) {
			return false;
		}
		
	}
	
	
	public static boolean checkIfValidPhone(String number) {
		
		//remove all predetermined special chars that are allowed
		number = removeSpecialChars(number);
		
		if(checkIfOnlyNums(number) == true) {
			
			if(number.length() == 10) {
				
				String areaCode = number.substring(0,3);
				String exCode = number.substring(3,6);
				
				if(areaCode.indexOf(1) != 0) {
					if(exCode.indexOf(1) != 0) {
						return true; //phone number is valid
					}
					
					else {
						return false; //invalid exCode
					}
					
				}
				
				else {
					return false; //invalid area code
				}
				
			}
			else {
				return false; //wrong amount of digits
			}
			
		}
		
		else {
			return false; //there were letters or something
		}
		
		
	}
	public static void main(String[] args) {
		
		
	
		
	}
}




	





