import java.util.Scanner;

/**
 * Reads three integers and prints the largest.
 *
 * Nested Math.max compares b and c first, then compares that result with a.
 * Equal values are handled naturally.
 *
 * Time complexity: O(1).
 * Auxiliary space: O(1).
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
