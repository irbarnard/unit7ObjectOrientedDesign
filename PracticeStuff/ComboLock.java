

/**
 * Write a description of class ComboLock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComboLock
{
   private static final int SECRET1 = 10;
   private static final int SECRET2 = 20;
   private static final int SECRET3 = 30;
   private int[] dial;
   //turn left from 0; turn right one full turn from current number and land on the second number; turn left and land on the third number
   public ComboLock( int secret1, int secret2, int secret3 ) 
   { 
     this.secret1 = secret1;
     this.secret2 = secret2;
     this.secret3 = secret3;
    
   }
   public void reset() 
   {     
    
    
   }
   public void turnLeft( int ticks ) 
   { 
        
    
   }
   public void turnRight( int ticks ) 
   {
    
    
   }
   public boolean open() 
   { 
    
   }
}