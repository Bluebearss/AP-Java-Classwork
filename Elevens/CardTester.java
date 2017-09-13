/**
 * This is a class that tests the Card class.
 */
public class CardTester
{
	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args)
	{
		Card cardOne = new Card("Jack", "Clubs", 10);
		Card cardTwo = new Card("Ace", "Hearts", 1);
		Card cardThree = new Card("Seven", "Diamonds", 7);
		Card cardFour = new Card("Seven", "Diamonds", 7);
		String[] suits = {"Two", "Seven", "King"};
		String[] ranks = {"Hearts", "Clubs"};
		int[] values = {2, 7, 10};
		Deck deckOne = new Deck(suits, ranks, values);
		
		System.out.println(cardOne);
		System.out.println(cardTwo);
		System.out.println(cardThree);
		System.out.println(cardThree.matches(cardFour));
		System.out.println();
		System.out.println(deckOne);
		System.out.println(deckOne.deal());
		System.out.println(deckOne.deal());
	}
}