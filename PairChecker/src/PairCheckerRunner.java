import java.util.Scanner;

public class PairCheckerRunner {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        PairChecker pairChecker = new PairChecker();

        System.out.print("\nEnter four numbers: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        int number4 = sc.nextInt();

        System.out.println(pairChecker.pairCheckerAmongNumbers(number1, number2, number3, number4));

        sc.close();
        
    }
}
