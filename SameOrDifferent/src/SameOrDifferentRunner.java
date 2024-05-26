import java.util.Scanner;

public class SameOrDifferentRunner {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        SameOrDifferent sameOrDifferent = new SameOrDifferent();

        System.out.print("\nEnter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        System.out.println(sameOrDifferent.sameOrdifferentChecker(number1, number2, number3));

        sc.close();
    }
}
