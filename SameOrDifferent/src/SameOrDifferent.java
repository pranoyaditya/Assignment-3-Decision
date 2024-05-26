public class SameOrDifferent {
    
    //returns the answer as a string.
    public String sameOrdifferentChecker(int number1, int number2, int number3)
    {
        if(number1 == number2 && number2 == number3)
        {
            return "all the same.\n";
        }
        else if(number1 != number2 && number2 != number3 && number3 != number1)
        {
            return "all different.\n";
        }

        return "neither\n";
    }
}
