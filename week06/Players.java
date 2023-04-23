package week06;

import java.util.ArrayList;
import java.util.List;

public class Players {
	
	List<Card> hand = new ArrayList<Card>();
	int score = 0;
	String name; 
	
	public Players (String name) {
		this.score = 0;
		this.name = name;
		
	}//end of Players

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void describe () {
		System.out.println( name);
		for (Card card : hand) {

			card.describe();		
			}
		
	}//end of describe
	
	public void draw (Deck deck) {
		hand.add(deck.draw());
		
	}//end of draw
	
	public Card flip ( ) {
		Card card = this.hand.remove(0);
		
		return card;
	
	}//end of flip

	public int incrementScore () {
		return this.score += 1; 
	}
}
