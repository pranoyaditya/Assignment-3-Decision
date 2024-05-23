public class DigitCalculator {
    
    // returns number of digits in the given number.
    public long calculateDigits(long number)
    {

        long count = 0;

        while(number != 0L)
        {
            count++;
            number /= 10L;
        }

        return count;
    }
}
