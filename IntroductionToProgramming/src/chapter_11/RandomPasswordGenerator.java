package chapter_11;

import java.util.Random;

/* 
* Random password generator between 8 and 15 characters,
* containing at least 2 capital letters, 2 small letters,
* 1 digit, 3 special characters and between 
* 0 and 7 random characters. 
*/
public class RandomPasswordGenerator {	
	private static final String CAPITAL_LETTERS =
			"ABCDEFGHIJKLMNOPQRSTUVWXYX";
	private static final String SMALL_LETTERS =
			"abcdefghijklmnopqrstuvwxyz";
	private static final String DIGITS = "0123456789";
	private static final String SPECIAL_CHARS =
			"~!@#$%^&*()_+=`{}[]\\|':;.,/?<>";
	private static final String ALL_CHARS = 
			CAPITAL_LETTERS + SMALL_LETTERS + DIGITS + SPECIAL_CHARS;
	
	private static Random rnd = new Random();
	
	public static void main(String[] args) {
		StringBuilder password = new StringBuilder();
		
		//Generate two random capital letters
		for (int i = 1; i <= 2; i++) {
			char capitalLetter = generateChar(CAPITAL_LETTERS);
			insertAtRandomPosition(password, capitalLetter);
		}
		
		//Generate two random small letters
		for (int i = 1; i <= 2; i++) {
			char smallLetter = generateChar(SMALL_LETTERS);
			insertAtRandomPosition(password, smallLetter);
		}
		
		//Generate one random digit
		char digit = generateChar(DIGITS);
		insertAtRandomPosition(password, digit);
		
		//Generate 3 special characters
		for (int i = 1; i <= 3; i++) {
			char specialChar = generateChar(SPECIAL_CHARS);
			insertAtRandomPosition(password, specialChar);
		}
		
		//Generate few random characters (between 0 and 7)
		int count = rnd.nextInt(8);
		for (int i = 1; i <= count; i++) {
			char specialChar = generateChar(ALL_CHARS);
			insertAtRandomPosition(password, specialChar);
		}
		
		System.out.println(password);
	}
	
	static void insertAtRandomPosition(
			StringBuilder password, char character) {
		int randomPosition = rnd.nextInt(password.length()+1);
		password.insert(randomPosition, character);
	}
	
	static char generateChar(String availableChars) {
		int randomIndex = rnd.nextInt(availableChars.length());
		char randomChar = availableChars.charAt(randomIndex);
		return randomChar;
	}
}