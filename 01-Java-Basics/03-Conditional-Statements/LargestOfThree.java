import java.util.Scanner;

/**
 * Reads three integers and prints their maximum.
 * Nested Math.max first compares b and c, then compares that result with a.
 * Equal values and negative values are handled naturally.
 *
 * Time: O(1). Auxiliary space: O(1).
 */
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest = Math.max(a, Math.max(b, c));
        System.out.println("Largest: " + largest);

        sc.close();
    }
}
