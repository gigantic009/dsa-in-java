/*
 * Problem: Determine whether an array contains any duplicate value.
 * Time: O(n) average | Auxiliary space: O(n)
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Array must not be null.");
        }

        // A set keeps only distinct values and supports average constant-time insertion.
        Set<Integer> values = new HashSet<>();
        for (int number : numbers) {
            // add() returns false when this value was already present.
            if (!values.add(number)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid size");
            sc.close();
            return;
        }
        int[] numbers = new int[n];
        System.out.println("Enter values:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Contains duplicate: " + containsDuplicate(numbers));
        sc.close();
    }
}
