import java.util.Scanner;

/**
 * Reads one integer and classifies it as even or odd.
 *
 * Logic: an integer is even when its remainder after division by 2 is zero.
 * Java also produces remainder zero for negative even integers.
 *
 * Time complexity: O(1).
 * Auxiliary space: O(1).
 */
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        // The ternary expression chooses one of the two output strings.
        System.out.println(n % 2 == 0 ? "Even" : "Odd");

        sc.close();
    }
}
