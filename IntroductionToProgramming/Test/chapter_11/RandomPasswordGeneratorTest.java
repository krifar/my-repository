package chapter_11;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomPasswordGeneratorTest {

	@Test
	public void testGenerateCharFromString() {
		String letters = "ABCDE";
		char expectedChar = RandomPasswordGenerator.generateChar(letters);
		assertTrue(letters.indexOf(expectedChar)>=0);
	}
	
	@Test
	public void testGenerateSpecificChar() {
		assertEquals('A', RandomPasswordGenerator.generateChar("A")); 
	}
	
	@Test
	public void testInsertAtRandomPosition() {
		StringBuilder password = new StringBuilder("12345");
		RandomPasswordGenerator.insertAtRandomPosition(password, 'Z');
		assertTrue(password.indexOf("Z")>=0);
	}
}