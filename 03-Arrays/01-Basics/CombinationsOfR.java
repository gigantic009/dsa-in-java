/*
 * Problem: Print every combination of r elements selected from an array of n elements.
 * LeetCode: Not available
 */

import java.util.Scanner;

public class CombinationsOfR {
    public static void generateCombinations(
            int[] numbers, int r, int start, int depth, int[] current) {
        // When r elements have been selected, print the combination.
        if (depth == r) {
            for (int i = 0; i < r; i++) {
                System.out.print(current[i] + " ");
            }
            System.out.println();
            return;
        }
        // Select each possible element and continue recursively.
        for (int i = start; i <= numbers.length - (r - depth); i++) {
            current[depth] = numbers[i];
            generateCombinations(
                    numbers, r, i + 1, depth + 1, current);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
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
        int[] current = new int[r];
        generateCombinations(numbers, r, 0, 0, current);
        sc.close();
    }
}
