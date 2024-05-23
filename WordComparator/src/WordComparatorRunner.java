import java.util.Scanner;

public class WordComparatorRunner {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        WordComparator wordComparator = new WordComparator();

        System.out.print("\nEnter a string: ");
        String st = sc.next();

        boolean ans = wordComparator.comparator(st);

        if(ans == true)
        {
            System.out.println("first and second half same");
        }
        else
        {
            System.out.println("first and second half different");
        }

        sc.close();
    }
}
