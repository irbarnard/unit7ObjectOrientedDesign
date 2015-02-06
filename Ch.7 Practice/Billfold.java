

/**
 * Write a description of class Billfold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Billfold extends Card
{
    Card slot1;
    Card slot2;
    Card newCard;
    Card newCard2;
    public Billfold(Card initSlot1, Card initSlot2 )
    {
        this.slot1 = initSlot1;
        this.slot2 = initSlot2;
    }

    public void addCard(Card newCard)
    {
        if (slot1.getName() == null)
        {
            slot1 = newCard;
        }
        else if(slot2.getName() == null)
        {
            slot2 = newCard;
        }
    }
    
    public String formatCards()
    {
        String str = slot1.getName() + ", "+ slot2.format(); 
        return str;
    }
}
