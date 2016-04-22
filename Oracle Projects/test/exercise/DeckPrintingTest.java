package exercise;

import static org.junit.Assert.*;

import org.junit.Test;

import exercise.Card.Suit;

public class DeckPrintingTest {

	@Test
	public void cardTest() {
		Card card = new Card("9", Suit.CLUB);
		String expectedOutput = "(9 CLUB)";
		assertEquals(card.toString(), expectedOutput);
	}
	
	@Test
	public void deckTest() {
		Deck newDeck = new Deck();
		assertTrue(newDeck.getNumberOfCards()==52);
	}
}
