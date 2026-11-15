/**
 * Question:
 * Given an integer array, determine whether any value appears at least
 * twice. Read n and the n array elements from standard input.
 *
 * LeetCode: #217
 *
 * Companies: Amazon
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] values) {
        Set<Integer> seen = new HashSet<>();
        for (int value : values) {
            if (!seen.add(value)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] values = new int[n];

        for (int i = 0; i < n; i++) values[i] = scanner.nextInt();

        System.out.println(containsDuplicate(values));
        scanner.close();
    }
}
