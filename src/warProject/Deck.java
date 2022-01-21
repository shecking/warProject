package warProject;

import java.util.*;

public class Deck {
	
	// stored card suits and values
	private static List<Integer> allValues() {
		return Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
	}
	private static List<String> allSuits() {
		return Arrays.asList("Clubs", "Diamonds", "Hearts", "Spades");
	}
	
	// fields
	private ArrayList<Card> deckOfCards;
	
	// constructor, passing in the deck (the Card objects)
	// no arguments, this is the object that will build the deck
	public Deck() {
		// retrieving a list of the suits and values
		List<Integer> values = Deck.allValues();
		List<String> suits = Deck.allSuits();
		
		// using field from above
		deckOfCards = new ArrayList<>();
		
		// adding Card objects to deckOfCards
		// loops 52 (4 suits x 13 values) times
		// advanced for loop
		for(String suit : suits) {
			for (Integer value : values) {
				deckOfCards.add(new Card(value, suit));
			}
		}
	}
	
	public String toString() {
		return deckOfCards.toString();
	}
	
	// other methods
	
	// getter/setter methods
	public ArrayList<Card> getDeckOfCards() {
		return deckOfCards;
	}
	public void setDeckOfCards(ArrayList<Card> deckOfCards) {
		this.deckOfCards = deckOfCards;
	}
	
	// shuffle method
	public void shuffle() {
		
		// new array to hold shuffled cards
		ArrayList<Card> shuffledDeckOfCards = new ArrayList<>();
		
		// manual loop to shuffle (not using pre-built method)	
		for (int i = 0; i < 52; i++) {
			
			// pulling random cards based on current deck size
			int eachCard = (int) (Math.random() * deckOfCards.size());
			Card removedCard = deckOfCards.remove(eachCard);
			// putting into new deck
			shuffledDeckOfCards.add(removedCard);
		}
		// overwriting the "old" deck, making the shuffled deck the "new" deck
		deckOfCards = shuffledDeckOfCards;
	}
	
	// draw method
	public Card draw() {
		// draw off top and remove from deck
		Card topCardOfDeck = deckOfCards.remove(0);
		return topCardOfDeck;
	}
}
