import java.util.Scanner;

public class NumberCheckRunner {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        NumberCheck numberCheck = new NumberCheck();

        System.out.print("\nEnter a number: ");
        int number = sc.nextInt();

        System.out.println("\nGiven number is: " + numberCheck.checkParity(number));

        sc.close();
    }
}
