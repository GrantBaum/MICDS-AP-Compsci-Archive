//importing libs
import java.util.Scanner;

public class PA09 {

	public static void main(String[] args) {
		
		//declaring input variables
		double usersalary; //salary
		double userexemp; //# of exemptions
		double usergains; //capitol gains
		double userinterest; //interest
		
		//declaring output variables
		double totalincome; //total income
		double adjustedincome; //adjusted income
		double totaltax; //total taxes
		double statetax; //state taxes
		
		
		//scanner creation
		Scanner input = new Scanner(System.in);
		
		
		//getting user inputs
		System.out.print("Salary: ");
		usersalary = input.nextDouble();
		System.out.print("Exemptions: ");
		userexemp = input.nextDouble();
		System.out.print("Interest: ");
		usergains = input.nextDouble();
		System.out.print("Gains: ");
		userinterest = input.nextDouble();
		
		//scanner is done so we close it
		input.close();
		
		
		//exemptions logic
		if (userexemp > 6) {
			userexemp = 6;
		}
		
		//formulas for calculations
		totalincome = (usersalary + userinterest + usergains) - 5000;
		adjustedincome = totalincome - (userexemp * 1500);
		statetax = adjustedincome * .065;
		
		//taxes logic
		if (adjustedincome > 50000) {
			totaltax = (.28 * (adjustedincome - 50000)) + 3450 + 1950;
		}
		else if (adjustedincome >= 35000 && adjustedincome < 50000) {
			totaltax = (.23 * (adjustedincome - 35000)) + 1950;
		}
		else if (adjustedincome >= 20000 && adjustedincome < 35000) {
			totaltax = (.13 * (adjustedincome - 20000));
		}
		else {
			totaltax = 0;
		}
	
		
		//rounding now so that all calculations are done with most accuracy
		System.out.println("Total Income: $" + Math.round(totalincome));//federal total income
		System.out.println("Adjusted Income: $" + Math.round(adjustedincome));//federal adjusted income
		System.out.println("Total Tax: $" + Math.round(totaltax));//federal tax
		System.out.println("State Tax: $" + Math.round(statetax));//state income tax
		
		
		
		

	}

}
