
/**
 * Write a description of class ComboLock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComboLock
{
    private int[] dial;
    private int lr = 0;
    int currentNum = 0;
    int numLocksOpened = 0;
    int num1;
    int num2;
    int num3;
    // turn left = adding , turn right = subtracting from the number
    public ComboLock( int secret1, int secret2, int secret3, int[] dial ) 
    { 
        num1 = secret1;
        num2 = secret2;
        num3 = secret3;
        
        for( int i = 0; i < 39; i++ )
        {
            dial[i] = i;
        }
    }

    public void reset() 
    {  
        currentNum = 0;
        lr = 0;
    }

    public void turnLeft( int ticks ) 
    { 
        if( currentNum + ticks > 39 )
        {
            currentNum = (currentNum+ticks)-39;
            lr+=1;
        }
        checkLocksOpened();
    }

    public void turnRight( int ticks ) 
    {
        if( currentNum + ticks < 0 )
        {
            currentNum = (currentNum-ticks)+39;
            lr -= 1;
        }
        checkLocksOpened();
    }

    public void checkLocksOpened()
    {
        if( (numLocksOpened == 0 && lr == -1) && currentNum == num1 )
        {
            numLocksOpened += 1;
        }
        else if( (numLocksOpened == 1 && lr == 0) && currentNum == num2 )
        {
            numLocksOpened += 1;
        }
        else if( (numLocksOpened == 2 && lr == -1) && currentNum == num3 )
        {
            numLocksOpened += 1;
        }
    }

    public boolean open() 
    { 
        if( numLocksOpened == 3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}