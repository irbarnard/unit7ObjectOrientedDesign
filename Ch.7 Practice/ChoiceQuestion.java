
public class ChoiceQuestion extends Question
{
    private int numberOfChoices;
    
    public ChoiceQuestion()
    {
        //calls the constructor of parent class
        super();
        numberOfChoices = 0;
    }
    
    //The question should be formatted as:
    //      How many sides in a sqaure?
    //      1.) 2
    //      2.) 3
    //      3.) 4
    public void addChoice( String choice, boolean correct )
    {
        numberOfChoices++;
        
        super.addText( "\n" + numberOfChoices + ")" + choice );
        
        if( correct )
        {
            String answerString = "" + numberOfChoices;
            super.setAnswer( answerString );
        }
    }
}
