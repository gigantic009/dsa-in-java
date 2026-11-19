/*
 * Problem: Print every combination of r elements selected from an array of n elements.
 * LeetCode: Not available
 * Time: O(C(n,r) * r) | Auxiliary space: O(r) recursion depth/current combination
 */

import java.util.Scanner;

public class CombinationsOfR {
    public static void generateCombinations(
            int[] numbers, int r, int start, int depth, int[] current) {
        // depth is how many choices are stored; once it reaches r, print the result.
        if (depth == r) {
            for (int i = 0; i < r; i++) {
                System.out.print(current[i] + " ");
            }
            System.out.println();
            return;
        }

        /*
         * Choose an index at or after start. The loop bound leaves enough elements
         * to fill all remaining positions; i + 1 prevents reusing an element and
         * ensures combinations are generated without permutation duplicates.
         */
        for (int i = start; i <= numbers.length - (r - depth); i++) {
            current[depth] = numbers[i];
            generateCombinations(numbers, r, i + 1, depth + 1, current);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid array size");
            sc.close();
            return;
        }

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int r = sc.nextInt();
        if (r < 0 || r > n) {
            System.out.println("Invalid r");
            sc.close();
            return;
        }

        // current holds the partial combination while recursion fills it.
        int[] current = new int[r];
        generateCombinations(numbers, r, 0, 0, current);
        sc.close();
    }
}
