package warProject;

public class Card {
	
	// fields
	private int value;
	private String suit;
	// private String name; 
	// why is the name field necessary? name is "created" using value and suit fields
	
	// constructor
	// code will call this to create a new instance of the object
	
	public Card(int value, String suit) {
		this.value = value;
		this.suit = suit;
		// this.name = name;
	}

	// getter/setter methods
	public String getSuit() {
		return suit;
	}

	public void setSuit(String newSuit) {
		this.suit = newSuit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int newValue) {
		this.value = newValue;
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String newName) {
//		this.name = newName;
//	}
	
	// describe method and toString method
	// these are very similar in function, one returns and one prints
	public void describe() {
		System.out.println("This card is the " + getValue() + " of " + getSuit());
	}
	
	public String toString() {
		return getValue() + " of " + getSuit();
	}
}
