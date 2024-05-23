import java.util.Scanner;

public class SmallOrLargeCheckerRunner {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        SmallOrLargeChecker smallOrLargeChecker = new SmallOrLargeChecker();

        System.out.print("\nEnter a number: ");
        double number = sc.nextDouble();

        String result = smallOrLargeChecker.checkParity(number);

        if(result != "zero")
        {
            System.out.print(result + " ");

            if(Math.abs(number) < 1)
            {
                System.out.println("small");
            }
            else if(Math.abs(number) > 1000000)
            {
                System.out.println("large");
            }
        }
        else
        {
            System.out.println(result);
        }

        sc.close();
    }
}
