//importing libs
import java.util.*;

public class PA11 {

	public static void main(String[] args) {
		
		//player variables
		int playerA;
		int playerB;
		int aWins = 0;
		int bWins = 0;
		boolean looper = true;
		
		//scanner
		Scanner input = new Scanner(System.in);
		
		while(looper) {
			//getting user inputs
			System.out.print("Player A: Rock (1), Paper (2), or Scissors (3)? ");
			playerA = input.nextInt();
			System.out.print("Player B: Rock (1), Paper (2), or Scissors (3)? ");
			playerB = input.nextInt();
		
			//make sure the input is within range first
			if(playerA >= 1 && playerA <= 3) {
				
				//then check player B
				if(playerB >= 1 && playerB <= 3) {
					
					//Rock (1) beats Scissors (3): (1-3+3) % 3 = 1
					//Paper (2) beats Rock (1): (2-1+3) % 3 = 1
					//Scissors (3) beats Paper (2): (3-2+3) % 3 = 1
				
					//tie logic, they got the same answer
					if((playerA - playerB +3) % 3 == 0) {
					
						//say its a tie and do nothing
						System.out.println("Tie!");
					
						//loop continues
					}
					
					//wins logic
					else if((playerA - playerB + 3) % 3 == 1) {
					
						//player A wins, add one to his tally
						System.out.println("Player A Wins!");
						aWins = aWins + 1;
						}
					else if((playerA - playerB + 3) % 3 == 2) {
					
						//player B wins, add one to his tally
						System.out.println("Player B Wins!");
						bWins = bWins + 1;
					
					//loop continues
					}
				
				
					//check if anyone won completely
					if(aWins >= 2) {
					
						//say A won the whole thing
						System.out.println("Player A wins " + aWins + " to " + bWins);
					
						//terminate the loop
						looper = false;
				
					}
					if(bWins >= 2) {
					
						//say B won the whole thing
						System.out.println("Player B wins " + bWins + " to " + aWins);
					
						//terminate the loop
						looper = false;
				}
				else {
					System.out.println("Invalid Selection");
				}
			}
			else {
				System.out.println("Invalid Selection");
			}

		}
		}
	}
}