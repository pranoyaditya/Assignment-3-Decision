import java.util.Scanner;

public class IncreasingOrDecreasingRunner {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        IncreasingOrDecreasing increasingOrDecreasing = new IncreasingOrDecreasing();

        System.out.print("\nEnter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        System.out.println(increasingOrDecreasing.increasingOrDecreasingChecker(number1, number2, number3));

        sc.close();
    }
}
