import java.util.Scanner;

public class OrderCheckRunner {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        OrderCheck orderCheck = new OrderCheck();

        System.out.print("\nEnter three numbers: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        System.out.println(orderCheck.orderChecker(number1, number2, number3));

        sc.close();
    }
}
