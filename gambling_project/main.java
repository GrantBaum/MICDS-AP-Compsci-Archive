package gambling_project;

import java.util.*;

public class main {
	
	//has to be static and class level so that I can access it from methods class for handOver() method
	static int balance = 1000; // Player starts with $1000
	
	//need this to be static too so i can access it from methods
	static Scanner scanner = new Scanner(System.in); // Scanner for user input
	
	static boolean gameOver = false;
	
	  
    public static void main(String[] args) {
    	
        
        System.out.println("Welcome to Blackjack! You start with " + colors.green + "$" + balance + colors.reset);

        while (balance > 0) { // Play until player runs out of money
            // Ask for bet amount
            int bet = 0;
            while (true) {
                System.out.print("Enter your bet (1 - " + balance + "): ");
                try {
                    bet = Integer.parseInt(scanner.nextLine().trim());
                    if (bet > 0 && bet <= balance) break;
                } catch (Exception e) {}
                System.out.println("Invalid bet. Try again.");
            }

            // Create and shuffle deck
            List<String> deck = new ArrayList<>(); //idk how big the array will be so i make an array list instead
            // Use Unicode suit characters
            String[] suits = {"\u2660","\u2665","\u2666","\u2663"}; // Spades, Hearts, Diamonds, Clubs
            String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
            for (String suit : suits) {
                for (String rank : ranks) {
                    deck.add(rank + suit); // e.g., "A♠" for Ace of Spades
                }
            }
            methods.shuffleDeck(deck); // Shuffle the deck

            // Create hands for player and dealer
            List<String> playerHand = new ArrayList<>();
            List<String> dealerHand = new ArrayList<>();

            // Deal initial two cards to player and dealer
            playerHand.add(methods.dealCard(deck));
            dealerHand.add(methods.dealCard(deck));
            playerHand.add(methods.dealCard(deck));
            dealerHand.add(methods.dealCard(deck));

            // Show initial hands with totals
            methods.displayHandWithTotal("Player", playerHand, false);
            methods.displayHandWithTotal("Dealer", dealerHand, true);

            boolean playerBlackjack = methods.isBlackjack(playerHand);
            boolean dealerBlackjack = methods.isBlackjack(dealerHand);

         // Check for initial blackjack
            if (playerBlackjack && dealerBlackjack) {
                System.out.println("Both have blackjack! It's a tie.");
                methods.pause(1500);
                // Bet returned

                methods.handOver(); //hand is over, display text
                if(gameOver) {
             	   break;
                }
                continue; //skip player turn if this happens
            } 
            else if (playerBlackjack) {
                System.out.println("Player has blackjack!");
                balance += (int)(bet + bet*1.5) - bet; 

                methods.handOver(); //hand is over, display text
                if(gameOver) {
             	   break;
                }
                continue; //skip player turn if this happens
            }
             else if (dealerBlackjack) {
                System.out.println("Dealer has blackjack!");
                methods.displayHandWithTotal("Dealer", dealerHand, false); // Show dealer hand
                methods.pause(500);
                System.out.println("You lose your bet.");
                balance -= bet; //bet taken
                methods.pause(1500);

                methods.handOver(); //hand is over, display text
                if(gameOver) {
             	   break;
                }
                continue; //skip player turn if this happens
            }

            // Player's turn, break signals basically the end of the turn
                        boolean doubled = false; //boolean for if the player has doubled or not

                        while (!methods.isBust(playerHand) && !methods.isBlackjack(playerHand)) { //if player doesnt have blackjack or busted
                           
                           //gets user stimulus
                            System.out.print("Hit, Stand, or Double? (h/s/d): ");
                            String choice = scanner.nextLine().trim().toLowerCase();
                            //error handling for incorrect data entry
                            while (!choice.equals("h") && !choice.equals("s") && !choice.equals("d")) {

                                System.out.print("Invalid input. Please enter 'h', 's', or 'd': ");
                                choice = scanner.nextLine().trim().toLowerCase();
                            }
                            //hitting
                            if (choice.equals("h")) {

                                playerHand.add(methods.dealCard(deck)); // Deal another card
                                methods.displayHandWithTotal("Player", playerHand, false); // Show updated hand
                                
                                //checking if the users hand is 21, if so they cant hit again
                                if(methods.calculateHandValue(playerHand) == 21) {
                                	break; //ends player turn
                                }
                            }
                            //doubling
                            else if (choice.equals("d")) {

                                //checks to see if user has enough money to double
                                if (balance >= bet * 2) {

                                    bet *= 2;
                                    playerHand.add(methods.dealCard(deck));
                                    methods.displayHandWithTotal("Player", playerHand, false);
                                    doubled = true; //setting doubled to true
                                    break; // Double ends player's turn
                                } 
                                //if they dont, they cant double and it sends them back
                                else {

                                    System.out.println("Not enough balance to double.");
                                }
                            }
                            //otherwise the player stands
                            else {

                                break; // Player stands
                            }
                        }
                        // Check if player busts
                        if (methods.isBust(playerHand)) {

                            System.out.println("Player busts! Dealer wins.");
                            balance -= bet;
                            methods.pause(1500);
                            methods.handOver(); //hand is over, display text
                            if(gameOver) {
                         	   break;
                            }
                        } 
                        //if the player doesnt bust, then it is the dealers turn
                        else {

                            // Dealer's turn 
                            methods.displayHandWithTotal("Dealer", dealerHand, false); // Reveal dealer's hand
                            methods.pause(1000);
                            //dealer hits until they get to 17 or more
                            while (methods.calculateHandValue(dealerHand) < 17) {

                                System.out.println("Dealer hits.");
                                methods.pause(1000);
                                dealerHand.add(methods.dealCard(deck)); // Dealer takes a card
                                methods.displayHandWithTotal("Dealer", dealerHand, false); // Show updated hand
                            }
            // Check if dealer busts
            if (methods.isBust(dealerHand)) {

               System.out.println("Dealer busts! Player wins.");
               balance += bet + bet; // Regular win pays 2x bet (net gain = bet)
               methods.pause(1500);
               methods.handOver(); //hand is over, display text
               if(gameOver) {
            	   break;
               }
                 } 
             //if we get here, nobody busted so we can compare values
             else {

               // Compare hands to determine winner
               int playerValue = methods.calculateHandValue(playerHand);
               int dealerValue = methods.calculateHandValue(dealerHand);
               System.out.println("Player's hand value: " + playerValue);
               System.out.println("Dealer's hand value: " + dealerValue);
               methods.pause(1000); 
                  
                        
            //Need this once to see who won at the end
            if (playerValue > dealerValue) {

                System.out.println("Player wins!");
                balance += (bet * 2) - bet; // Regular win pays 2x bet (net gain = bet)
                methods.pause(1500);
                methods.handOver(); //hand is over, display text
                if(gameOver) {
             	   break;
                }
            }
            else if (playerValue < dealerValue) {

                System.out.println("Dealer wins!");
                balance -= bet;
                methods.pause(1500);
                methods.handOver(); //hand is over, display text
                if(gameOver) {
             	   break;
                }
                } 
            else {

                System.out.println("Push! Bet returned.");
                methods.pause(1500);
                // No change to balance
                methods.handOver(); //hand is over, display text
                if(gameOver) {
             	   break;
                }
            }
        }
    }
    }
    }


    

 public class methods {	 
	 
	 // Shuffles a deck of cards
	 public static void shuffleDeck(List<String> deck) {
	     Collections.shuffle(deck); // shuffles the list randomly
	 }

	// Helper method to pause for aesthetics
	    public static void pause(int ms) {
	        try {
	            Thread.sleep(ms);
	        } catch (InterruptedException e) {
	            // ignore
	        }
	    }
	    
	 // Deals a card from the deck
	 public static String dealCard(List<String> deck) {
	     return deck.remove(0); // removes and returns the first element in the list
	 }


	 // Calculates the value of a hand
	 public static int calculateHandValue(List<String> hand) {
	     int value = 0;
	     int aceCount = 0;
	     for (String card : hand) {
	         // hand.size() gets the number of cards in the hand
	         String rank = card.substring(0, card.length() - 1); // gets all but last char, the suit
	         if ("JQK".contains(rank)) { // checks if rank is J, Q, or K
	             value += 10;
	         } else if ("A".equals(rank)) { // checks if rank is A
	             value += 11;
	             aceCount++;
	         } else {
	             value += Integer.parseInt(rank); // converts rank string to int
	         }
	     }

	     // Adjust for aces
	     while (value > 21 && aceCount > 0) {
	         value -= 10;
	         aceCount--;
	     }
	     return value;
	 }


	 // Displays a hand
	 /// Helper method to display hand with total value
	    public static void displayHandWithTotal(String owner, List<String> hand, boolean hideFirstCard) {
	        System.out.print(owner + "'s hand: ");
	        for (int i = 0; i < hand.size(); i++) {
	            if (hideFirstCard && i == 0) {
	                System.out.print("[hidden] ");
	            } else {
	                System.out.print(colorCard(hand.get(i)) + " ");
	            }
	        }
	        // Show total. if hiding first card, dont print anything
	        int total;
	        if (!hideFirstCard) {
	        	total = methods.calculateHandValue(hand);
	            System.out.println("(Total: " + total + ")");
	        } else {
	            /*do nothing, dont want total to be shown here cause
	        	  this means first card is hidden */
	        	System.out.print("\n"); //makes a new line in between dealers cards and prompt
	        }
	    
	        }
	    
	    public static String colorCard(String card) {
	        // Check if card contains ♥ or ♦
	    	if(card.contains("\u2665") || card.contains("\u2666")) {
	    		//add red
	    		return colors.red + card + colors.reset;
	    	}
	    	else {
	    		//add black
	    		return colors.black + card + colors.reset;
	    	}
	    	
	    }


	 // Checks if hand is blackjack 
	 public static boolean isBlackjack(List<String> hand) {
	     return hand.size() == 2 && calculateHandValue(hand) == 21; // hand.size gets number of cards
	 }


	 // Checks if hand is bust
	 public static boolean isBust(List<String> hand) {
	     return calculateHandValue(hand) > 21;
	 }
	 
	 public static void clearScreen() {
		    System.out.print("\033[H\033[2J");
		    System.out.flush();
		}

	//This appears a ton in the code. Lets make it a void method

	 public static void handOver(){
	             if (balance == 0) {
	            	 
	                 System.out.println("You're out of money! Game over.");
	                 gameOver = true; //game is over if user is out of money
	             }
	             
	             //added this else if, so that if the balance is 0 the game automatically ends and user doesnt get to choose to play again
	             else if(balance > 0) {
	             System.out.println("Your balance: " + colors.green + "$" + balance + colors.reset);
	             pause(150);
	             System.out.print("Play again? (y/n): ");
	             String again = scanner.nextLine().trim().toLowerCase();
	             
	             if (!(again.equals("y") || again.equals("n"))) {
	            	 
	            	//added while loop here to keep asking until valid input is achived
	            	while(true) {
	            		
	            	 System.out.print("Invalid input. Please enter 'y' or 'n': ");
	            	 again = scanner.nextLine().trim().toLowerCase();
	            	 
	            	 if(again.equals("y")) {
		            	 break; //exit this while loop
		             }
	            	 
	            	 else if(again.equals("n")) {
		            	 System.out.println("Thanks for playing! Final balance: "+ colors.green + "$" + balance + colors.reset);
		                 
		            	 
		                  gameOver = true; //if this if branch is hit, then the gameover var will change
		                  //globally, triggering the break so the game will end
		                  
		                  break; //exit this while loop
		             }
	            	 
	            	}
	             }
	             else if(again.equals("y")) {
	            	 //do nothing
	             }
	             else if(again.equals("n")) {
	            	 System.out.println("Thanks for playing! Final balance: "+ colors.green + "$" + balance + colors.reset);
	                 
	                  gameOver = true; //if this if branch is hit, then the gameover var will change
	                  //globally, triggering the break so the game will end
	             }
	             }
	             }
	         }
 
 			public class colors {
 				public static final String reset = "\u001B[0m";
 				public static final String black = "\u001B[30m";
 				public static final String red = "\u001B[31m";
 				public static final String green = "\u001B[32m";
 				
 				//example System.out.println(colors.red + "This text is green." + colors.reset);


 }
	}

    

