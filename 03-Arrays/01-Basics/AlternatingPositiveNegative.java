/*
 * Problem: Rearrange an array so positive and negative values alternate.
 * Start with a positive value. If one type has extra values, place them at the end.
 * LeetCode: Not available
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlternatingPositiveNegative {
    public static void rearrange(int[] numbers) {
        List<Integer> positiveNumbers = new ArrayList<>();
        List<Integer> negativeNumbers = new ArrayList<>();
        // Separate the positive and negative values.
        // Zero is treated as a non-negative value.
        for (int number : numbers) {
            if (number >= 0) {
                positiveNumbers.add(number);
            } else {
                negativeNumbers.add(number);
            }
        }
        int index = 0;
        int positiveIndex = 0;
        int negativeIndex = 0;
        // Place one positive value, then one negative value.
        while (positiveIndex < positiveNumbers.size()
                && negativeIndex < negativeNumbers.size()) {
            numbers[index] = positiveNumbers.get(positiveIndex);
            positiveIndex++;
            index++;
            numbers[index] = negativeNumbers.get(negativeIndex);
            negativeIndex++;
            index++;
        }
        // Add any remaining positive values.
        while (positiveIndex < positiveNumbers.size()) {
            numbers[index] = positiveNumbers.get(positiveIndex);
            positiveIndex++;
            index++;
        }
        // Add any remaining negative values.
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
