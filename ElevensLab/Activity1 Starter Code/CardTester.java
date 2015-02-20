/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("A", "Hearts", 13);
		Card card2 = new Card("B", "Diamonds", 12);
		Card card3 = new Card("C", "Spades", 11);
		
		boolean bool = card1.matches(card2);
		System.out.println(bool);
		
		boolean bool2 = card2.matches(card2);
		System.out.println(bool2);
		
		boolean bool3 = card3.matches(card1);
		System.out.println(bool3);
	}
}
