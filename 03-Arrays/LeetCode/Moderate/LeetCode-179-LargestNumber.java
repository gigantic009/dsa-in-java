/*
 * Problem: Arrange non-negative integers to form the largest possible number.
 * LeetCode: #179
 * Time: O(n log n * k) | Space: O(n * k), where k is max token length
 */
import java.util.Arrays;
import java.util.Scanner;

class LeetCode179LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] numbers = new String[n];
        for (int i = 0; i < n; i++) {
            long value = scanner.nextLong();
            if (value < 0) {
                System.out.println("Inputs must be non-negative");
                scanner.close();
                return;
            }
            // Strings let the comparator test concatenated orders without overflow.
            numbers[i] = String.valueOf(value);
        }

        /*
         * Compare a+b against b+a. If b+a is larger, b should precede a.
         * This pairwise ordering maximizes the full concatenated result.
         */
        Arrays.sort(numbers, (first, second) ->
                (second + first).compareTo(first + second));
        if (n == 0) {
            System.out.println("");
            scanner.close();
            return;
        }
        // If the leading token is zero, all tokens must be zero.
        if (numbers[0].equals("0")) {
            System.out.println("0");
            scanner.close();
            return;
        }
        // Concatenate the sorted tokens to form the final number.
        StringBuilder result = new StringBuilder();
        for (String number : numbers) {
            result.append(number);
        }
        System.out.println(result);
        scanner.close();
    }
}
