import java.util.Scanner;

/**
 * Reads one integer and classifies it as even or odd.
 * An integer is even when its remainder after division by 2 is zero.
 * Negative even integers also have remainder zero.
 *
 * Time: O(1). Auxiliary space: O(1).
 */
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        System.out.println(n % 2 == 0 ? "Even" : "Odd");
        sc.close();
    }
}
