import java.util.Scanner;

public class CharacterComparatorRunner {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        CharacterComparator characterComparator = new CharacterComparator();

        System.out.print("\nEnter a string: ");
        String st = sc.next();

        boolean ans = characterComparator.comparator(st);

        if(ans == true)
        {
            System.out.println("first and last letter same");
        }
        else
        {
            System.out.println("first and last letter different");
        }

        sc.close();
    }
}
