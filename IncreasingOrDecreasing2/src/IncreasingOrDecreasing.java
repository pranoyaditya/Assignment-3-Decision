public class IncreasingOrDecreasing {
    
    // returns answer as a string based on the conditions
    public String increasingOrDecreasingChecker(int number1, int number2, int number3, String condition)
    {
        if(condition.compareTo("strict") == 0)
        {
            if(number1 < number2 && number2 < number3) 
            {
                return "increasing.\n";
            }
            else if(number1 > number2 && number2 > number3)
            {
                return "decreasing.\n";
            }

            return "neither.\n";
        }

        if(number1 <= number2 && number2 <= number3) 
        {
            if(number1 == number2 && number2 == number3)
            {
                return "increasing.\ndecreasing.\n";
            }
            else return "increasing.\n";
        }
        else if(number1 >= number2 && number2 >= number3)
        {
            if(number1 == number2 && number2 == number3)
            {
                return "increasing.\ndecreasing.\n";
            }
            else return "decreasing.\n";
        }

        return "neither.\n";
    }
}
