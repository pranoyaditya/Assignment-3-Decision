public class NumberCheck {
    
    // returns a string corresponding to the number.
    public String checkParity(int number)
    {
        if(number > 0) return "Positive";
        else if(number < 0) return "Negative";

        return "Zero";
    }
}
