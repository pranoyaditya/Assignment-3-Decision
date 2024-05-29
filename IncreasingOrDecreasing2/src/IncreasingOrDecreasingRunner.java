import java.util.Scanner;

public class IncreasingOrDecreasingRunner {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        IncreasingOrDecreasing increasingOrDecreasing = new IncreasingOrDecreasing();

        System.out.print("\nIncreasing/decreasing should be strict or lenient? (strict/lenient): ");
        String condition = sc.next();
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        System.out.println(increasingOrDecreasing.increasingOrDecreasingChecker(number1, number2, number3,condition));

        sc.close();
    }
}
