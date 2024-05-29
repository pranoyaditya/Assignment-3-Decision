public class OrderCheck {
    
    // returns a string as answer.
    public String orderChecker(int number1, int number2, int number3)
    {
        if(number1 <= number2 && number2 <= number3) 
        {
            return "in order.\n";
        }
        else if(number1 >= number2 && number2 >= number3)
        {
            return "in order.\n";
        }

        return "not in order.\n";
    }
}
