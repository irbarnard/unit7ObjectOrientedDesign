
public class NumericQuestion extends Question
{
    private double answer;
    
    public NumericQuestion()
    {
       
    }
    
    public void setAnswer(double correctResponce)
    {
        answer = correctResponce;
    }
    
    public boolean checkAnswer(String responce)
    {
        double responceAsDouble = Double.parseDouble( responce );
        return Math.abs(responceAsDouble - answer) <= 0.01;
    }
    
}
