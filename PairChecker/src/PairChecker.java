public class PairChecker {
    
    // returns a string as answer.
    public String pairCheckerAmongNumbers(int number1, int number2, int number3, int number4)
    {
        if(number1 == number2 && number3 == number4)
        {
            return "two pairs.\n";
        }
        else if(number1 == number3 && number2 == number4)
        {
            return "two pairs.\n";
        }
        else if(number1 == number4 && number2 == number3)
        {
            return "two pairs.\n";
        }
        
        return "not two pairs.\n";
    }
}
