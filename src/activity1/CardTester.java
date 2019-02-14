package activity1;

import activity1.Card;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("King", "Hearts", 13);
		System.out.println(card1.suit() + " " + card1.rank() + " " + card1.pointValue() + " " + card1.toString());
		Card card2 = new Card("Ten", "Diamonds", 10);
		System.out.println(card2.suit() + " " + card2.rank() + " " + card2.pointValue() + " " + card2.toString());
		Card card3 = new Card("Six", "Spades", 6);
		System.out.println(card3.suit() + " " + card3.rank() + " " + card3.pointValue() + " " + card3.toString());
		
		System.out.println(card1.matches(card2));
	}
}