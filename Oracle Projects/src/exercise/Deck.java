package exercise;

import java.util.ArrayList;
import exercise.Card.Suit;

public class Deck {
	private ArrayList<Card> deck;
	private static String[] allRanks; 
	private static Suit[] allSuits;
	
	public Deck() {
		allRanks = new String[] {"A", "2", "3", "4", "5", "6", 
			"7", "8", "9", "10", "J", "Q", "K"};
		allSuits = new Suit[] {
			Suit.CLUB, Suit.DIAMOND, Suit.HEART, Suit.SPADE};
		deck = new ArrayList<>();
		for (String rank : allRanks) {
			for (Suit suit : allSuits) {
				Card card = new Card(rank, suit);
				deck.add(card);
			}
		}
	}
	
	public int getNumberOfCards() {
		return this.deck.size();
	}
	
	public void PrintCards() {
		for (Card card : this.deck) {
			System.out.print(card + " ");
		}
	}
}
