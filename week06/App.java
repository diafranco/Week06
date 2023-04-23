package week06;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {
	
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		Deck deck = new Deck ();
		System.out.println("Let's play a game of WAR!");
		
		
		
		System.out.println("Who is the first player?");
		String input1 = kb.next();
		System.out.println("Who is the opponent?");
		String input2 = kb.next();
		
		System.out.println("Let's begin!");
		
		System.out.println();
		Players player1 = new Players(input1); 
		Players player2 = new Players(input2);
		
		deck.shuffle();
		
		for( int i = 0; i < 52; i ++) {
			if (i % 2 == 0) {
			player1.draw(deck);}
			else{
			player2.draw(deck);}
			
		}
		
		// test each player's hand
//		player1.describe();
//		System.out.println("---------------");
//		player2.describe();
		int intRound = 0;
		for ( int i = 0; i < 26; i ++) {
			Card p1 = player1.flip();
			Card p2 = player2.flip();
			
			//System.out.println("Round " + intRound );
			System.out.print(player1.getName() + " plays " );
			p1.describe();
			
			System.out.print(player2.getName() + " plays " );
			p2.describe();
			intRound ++;
			
			if ( p1.getValue() > p2.getValue()) {
				player1.incrementScore();
				System.out.println(player1.getName() + " wins round " + intRound  + "!");
			}
			else if (p2.getValue() > p1.getValue()) {
				player2.incrementScore();
				System.out.println(player2.getName() + " wins round " + intRound  + "!");
			}
			else {
				System.out.println("No winner - DRAW");
			}
			System.out.println("Score: " + player1.getName() + " - " + player1.getScore() + " / "+ player2.getName() + " - " + player2.getScore());
			System.out.println();

		}
		
		if ( player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " is the winner with " + player1.getScore() + " points!"	);
		}
		else {
			System.out.println(player2.getName() + " is the winner with " + player2.getScore() + " points!"	);
		}

		
		
		
	}

}
