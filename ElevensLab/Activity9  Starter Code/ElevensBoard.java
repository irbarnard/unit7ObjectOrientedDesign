import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

    /**
     * The size (number of cards) on the board.
     */
    private static final int BOARD_SIZE = 9;

    /**
     * The ranks of the cards for this game to be sent to the deck.
     */
    private static final String[] RANKS =
        {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

    /**
     * The suits of the cards for this game to be sent to the deck.
     */
    private static final String[] SUITS =
        {"spades", "hearts", "diamonds", "clubs"};

    /**
     * The values of the cards for this game to be sent to the deck.
     */
    private static final int[] POINT_VALUES =
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

    /**
     * Flag used to control debugging print statements.
     */
    private static final boolean I_AM_DEBUGGING = false;


    /**
     * Creates a new <code>ElevensBoard</code> instance.
     */
     public ElevensBoard() {
        super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
     }

    /**
     * Determines if the selected cards form a valid group for removal.
     * In Elevens, the legal groups are (1) a pair of non-face cards
     * whose values add to 11, and (2) a group of three cards consisting of
     * a jack, a queen, and a king in some order.
     * @param selectedCards the list of the indices of the selected cards.
     * @return true if the selected cards form a valid group for removal;
     *         false otherwise.
     */
    @Override
    public boolean isLegal(List<Integer> selectedCards) {

        int length = selectedCards.size();
        if(length == 2 || length == 3)
        {
            if(containsPairSum(ist<Integer> selectedCards)== true)
            {
                return true;
            }
        }
        else
        {
            return false;
        }
    }

    /**
     * Determine if there are any legal plays left on the board.
     * In Elevens, there is a legal play if the board contains
     * (1) a pair of non-face cards whose values add to 11, or (2) a group
     * of three cards consisting of a jack, a queen, and a king in some order.
     * @return true if there is a legal play left on the board;
     *         false otherwise.
     */
    @Override
    public boolean anotherPlayIsPossible() {
        int j;
        int q;
        int k;
        Card temp = new Card();
        for(int i: cards)
        {
            if(i.rank == "Jack")
            {
                j++;
            }
            else if(i.rank == "Queen")
            {
                q++;
            }
            else if(i.rank == "Jack")
            {
                k++;
            }
        }
        for(Card j  : cards)
        {
            temp = cards[j];
            for(Card n : cards)
            {
                if (cards.isLegal(temp, cards[j]))
                {
                    return true;
                }
            }
        }
        if(board.isLegal == true)
        {
            return true;
        }
        else if(j > 0 && q > 0 && k > 0)
        {
            true;
        }
        return false;
    }

    /**
     * Check for an 11-pair in the selected cards.
     * @param selectedCards selects a subset of this board.  It is list
     *                      of indexes into this board that are searched
     *                      to find an 11-pair.
     * @return true if the board entries in selectedCards
     *              contain an 11-pair; false otherwise.
     */
    private boolean containsPairSum11(List<Integer> selectedCards) {
        int length = selectedCards.size();
        if(length == 2 )
        {
            if(cards[0]+ cards[1] == 11)
            {
                return true;
            }
        }
        return false
    }

    /**
     * Check for a JQK in the selected cards.
     * @param selectedCards selects a subset of this board.  It is list
     *                      of indexes into this board that are searched
     *                      to find a JQK group.
     * @return true if the board entries in selectedCards
     *              include a jack, a queen, and a king; false otherwise.
     */
    private boolean containsJQK(List<Integer> selectedCards) {
        int length = selectedCards.size();
        if(length == 3)
        {
            for(int i: cards)
            {
                if(i.rank == "Jack")
                {
                    j++;
                }
                else if(i.rank == "Queen")
                {
                    q++;
                }
                else if(i.rank == "Jack")
                {
                    k++;
                }
            }
            if(j > 0 && q > 0 && k > 0)
            {
                return true;
            }
        }
        return false
    }
}
