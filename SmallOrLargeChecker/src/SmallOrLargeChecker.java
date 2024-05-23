public class SmallOrLargeChecker {
    
    // returns range of given number. Positive if the number is positive, negative if number is negative otherwise zero.
    public String checkParity(double number)
    {
        if(number > 0) return "positive";
        else if(number < 0) return "negative";

        return "zero";
    }

}
