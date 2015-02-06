

/**
 * Write a description of class DriverLicense here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DriverLicense extends Card
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;
    String expYear;
    /**
     * Default constructor for objects of class DriverLicense
     */
    public DriverLicense( String initExpYear )
    {
        expYear = initExpYear;
    }

    public String format()
    {
        String str = super.format()+"\nDrivers License Expiration Year: "+expYear;
        return str;
    }

}
