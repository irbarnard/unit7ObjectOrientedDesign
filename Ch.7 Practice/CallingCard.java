

/**
 * Write a description of class CallingCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CallingCard extends Card
{
    /** description of instance variable x (add comment for each instance variable) */
    String cardNumber;
    String pin;
    public boolean equals(Object otherObject)
    {
        if(getClass() == otherObject.getClass())
        {
            CallingCard other = (CallingCard) otherObject;
            return getName().equals(other.getName())
                && cardNumber.equals(otherCardNumber) && pin = other.pin;
        }
    }
    /**
     * Default constructor for objects of class CallingCard
     */
    public CallingCard( String initCardNumber, String initPin) 
    {
        cardNumber = initCardNumber;
        pin = initPin;
    }

    public String format()
    {
        String str = super.format()+"\nCard#: "+cardNumber+"\nPIN#: "+pin;
        return str;
    }

}
