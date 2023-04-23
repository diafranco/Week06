package week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> cards = new ArrayList<Card>();
	
	Deck(){
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String [] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
		for (String suit : suits) {
			int count = 2; 
			for(String number : numbers) {
				Card card = new Card(( number + " of " + suit), count);
				this.cards.add(card);
				count ++;
			}
		}//end of loop
		
	}//end of Deck

	public List<Card> getCards() {
		return cards;
	}//end of getCards

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}//end of setCards
	
	public void describe() { 
		for (Card card : this.cards) {
			card.describe();
		}
	}//end of describe
	
	public void shuffle() {
		Collections.shuffle(this.cards);
	}//end of shuffle
	
	public Card draw () {
		
		Card card = this.cards.remove(0);
			
		return card;
	}
	
}
