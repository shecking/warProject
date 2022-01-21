package warProject;

import java.util.*;

public class App {
	public static void main(String[] args) {
		
		// instantiating the deck
		Deck deck = new Deck();
		
		// instantiating the players with names
		Player playerOne = new Player("Aidan");
		Player playerTwo = new Player("Bobby");
		
		// shuffle deck
		deck.shuffle();
		//System.out.println(deck.toString());
		
		for (int i = 0; i < 52; i++) {
			// players drawing back and forth
			if (i % 2 == 0) {
				playerOne.draw(deck);
			} else {
				playerTwo.draw(deck);
			}
		}
		
		// print hands after dealing to check
		System.out.println(playerOne.getName() + "'s hand: " + playerOne.getHand());
		System.out.println(playerTwo.getName() + "'s hand: " + playerTwo.getHand());
		System.out.println("");
		
		// looping to flip and compare
		for(int i = 0; i < 26; i++) {
			
			// flipping
			Card faceUpOne = playerOne.flip();
			Card faceUpTwo = playerTwo.flip();
			
			// comparison
			// if player 1 is higher
			if (faceUpOne.getValue() > faceUpTwo.getValue()) {
				playerOne.incrementScore();
			} 
			// if player 2 is higher
			else if (faceUpOne.getValue() < faceUpTwo.getValue()) {
				playerTwo.incrementScore();
			} 
			// if players tie
			else {
				// do nothing OR both increment score
				// playerOne.incrementScore();
				// playerTwo.incrementScore();
			}	
		}
		
		// printing names and scores
		
		int points1 = playerOne.getScore();
		String name1 = playerOne.getName();
		
		int points2 = playerTwo.getScore();
		String name2 = playerTwo.getName();
		
		System.out.println(name1 + ": " + points1 + " points");
		System.out.println(name2 + ": " + points2 + " points");
		
		// printing winner
		
		// if player 1 wins
		if (points1 > points2) {
			System.out.println(name1 + " wins");
		} 
		// if player 2 wins
		else if (points1 < points2) {
			System.out.println(name2 + " wins");
		}
		// if tie
		else {
			System.out.println("Draw");
		}
	}
}
