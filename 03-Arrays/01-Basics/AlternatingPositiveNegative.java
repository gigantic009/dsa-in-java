/*
 * Problem: Rearrange an array so positive and negative values alternate.
 * Start with a positive value. If one type has extra values, place them at the end.
 * LeetCode: Not available
 * Time: O(n) | Auxiliary space: O(n)
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlternatingPositiveNegative {
    public static void rearrange(int[] numbers) {
        // Separate values so alternating placement does not lose either group.
        List<Integer> positiveNumbers = new ArrayList<>();
        List<Integer> negativeNumbers = new ArrayList<>();
        // Zero is treated as non-negative in this implementation.
        for (int number : numbers) {
            if (number >= 0) {
                positiveNumbers.add(number);
            } else {
                negativeNumbers.add(number);
            }
        }

        // Read each separated list with its own pointer and write into the original array.
        int index = 0;
        int positiveIndex = 0;
        int negativeIndex = 0;
        // Place non-negative then negative values while both groups have values.
        while (positiveIndex < positiveNumbers.size()
                && negativeIndex < negativeNumbers.size()) {
            numbers[index] = positiveNumbers.get(positiveIndex);
            positiveIndex++;
            index++;
            numbers[index] = negativeNumbers.get(negativeIndex);
            negativeIndex++;
            index++;
        }
        // If one group is larger, its remaining values are placed at the end.
        while (positiveIndex < positiveNumbers.size()) {
            numbers[index] = positiveNumbers.get(positiveIndex);
            positiveIndex++;
            index++;
        }
        while (negativeIndex < negativeNumbers.size()) {
            numbers[index] = negativeNumbers.get(negativeIndex);
            negativeIndex++;
            index++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        rearrange(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        sc.close();
    }
}
