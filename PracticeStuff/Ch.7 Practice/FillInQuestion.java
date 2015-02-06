
public class FillInQuestion extends Question
{
    // sample question"The inventor of Java was _James Gosling_"
    // parse the specified question into a question to display and
    //an answer to check:
    // question: "The inventor of JAva was _____."
    // answer: "James Gosling"
    
    public FillInQuestion()
    {
    }
    
    public void setText( String questionText )
    {
        Scanner parser = new Scanner( questionText );
        parser.useDelimiter( "_" );
        String question = parser.next();
        String answer = parser.next();
        question += "_____" + parser.next();
        
        text = question;
        
        super.setText( question );
        super.setAnswer( question );
    }
}
