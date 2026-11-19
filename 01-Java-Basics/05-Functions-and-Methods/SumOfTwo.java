import java.util.Scanner;

/**
 * Demonstrates passing two integer arguments and returning their sum.
 * Integer addition may overflow for values outside the int result range.
 *
 * Time complexity of sum: O(1).
 * Auxiliary space of sum: O(1).
 */
public class SumOfTwo {
    /** Returns the arithmetic sum of the two int arguments. */
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = sum(a, b);
        System.out.println("Sum: " + result);

        sc.close();
    }
}
