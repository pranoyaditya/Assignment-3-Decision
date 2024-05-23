import java.util.Scanner;

public class DigitCalculatorRunner {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        DigitCalculator digitCalculator = new DigitCalculator();

        System.out.print("\nEnter a number: ");
        long number = sc.nextInt();

        if(number >= 10L && number <= 100000000000L)
        {
            System.out.println("Number of digits: " + digitCalculator.calculateDigits(number));
        }
        else if(number < 0)
        {
            System.out.println("Number of digits: " + digitCalculator.calculateDigits(-1L*number));
        }
        else 
        {
            System.out.println("Number of digits: 1");
        }

        sc.close();

    }
}
