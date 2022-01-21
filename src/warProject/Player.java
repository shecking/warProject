package warProject;

import java.util.*;

public class Player {
	
	// fields
	private ArrayList <Card> hand;
	private int score;
	private String name;
	
	// constructor
	public Player(String name) {
		this.hand = new ArrayList<>();
		this.score = 0;
		this.name = name;
	}
	
	// methods
	
	// getter/setter methods
	public ArrayList<Card> getHand() {
		return hand;
	}
	public void setHand(ArrayList<Card> hand) {
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

	// describe method
	public void describe() {
		// printing name and current hand
		System.out.println("Player name: " + getName());
		System.out.println("Player hand: " + getHand());
	}
	
	// flip method
	public Card flip() {
		Card topCardOfHand = getHand().remove(0);
		return topCardOfHand;
	}
	
	// draw method
	public void draw(Deck deck) {
		Card drawnCard = deck.draw();
		ArrayList<Card> currentHand = getHand();
		currentHand.add(drawnCard);
	}
	
	// incrementScore method
	public void incrementScore() {
		setScore(getScore() + 1);
	}
}
