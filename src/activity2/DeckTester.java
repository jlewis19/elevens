package activity2;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"Ten", "King", "Ace"};
		String[] suits = {"Hearts", "Clovers"};
		int[] values = {10, 54, 43};
		Deck deck1 = new Deck(ranks, suits, values);
		System.out.println(deck1.isEmpty() + " " + deck1.size() + " " + deck1.deal());
		
		String[] ranks2 = {"Doggo", "Cat", "Lion"};
		String[] suits2 = {"Shovel", "Hoe", "Axe"};
		int[] values2 = {1, 2};
		Deck deck2 = new Deck(ranks2, suits2, values2);
		System.out.println(deck2.isEmpty() + " " + deck2.size() + " " + deck2.deal());
		
		String[] ranks3 = {"One"};
		String[] suits3 = {"Spades"};
		int[] values3 = {10, 54, 43};
		Deck deck3 = new Deck(ranks3, suits3, values3);
		System.out.println(deck3.isEmpty() + " " + deck3.size() + " " + deck3.deal());
	}
}
