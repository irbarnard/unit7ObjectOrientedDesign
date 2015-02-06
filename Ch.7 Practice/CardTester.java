

/**
 * Write a description of class CardTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CardTester 
{
    
    public static void main(String[] args)
    {
        Card slot1 = new Card(null);
        Card slot2 = new Card(null);
        IDCard newCard = new IDCard("Seawon","c1");
        DriverLicense newCard2 = new DriverLicense("2020");
        Billfold test = new Billfold(slot1, slot2 );
        test.addCard( newCard );
        test.addCard( newCard2 );
        System.out.println(test.formatCards());
    }
    
}
