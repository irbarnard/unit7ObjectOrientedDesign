
public class FillInQuestion extends Question
{
    //Specified question: the inventor of Java was _James Gosling_
    //parse the specified question into a question to display and an answer to check
    //Question: "The inventor of Java was_____."
    // answer: "James Gosling"
    FillInQuestion()
    {
    }
    
    public void setText(String questionText)
    {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter( "_" );
        String question = parser.next();
        String answer = parser.next();
        question += "_____" + parser.next();
        
        super.setText(question);
        super.setAnswer(question);
    }
    
    
}
