/*
 * Problem: Rearrange an array so all negative elements appear on one side.
 * LeetCode: Not available
 * Time: O(n) | Auxiliary space: O(1)
 * Note: The relative order of elements is not preserved.
 */
import java.util.Arrays;
import java.util.Scanner;

public class MoveNegativesToOneSide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        /*
         * nextNegativePosition marks the next slot reserved for a negative value.
         * When a negative is found, swap it into that slot and advance the boundary.
         * This partitions negatives to the front in one pass; other values follow.
         */
        int nextNegativePosition = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] < 0) {
                int temp = numbers[i];
                numbers[i] = numbers[nextNegativePosition];
                numbers[nextNegativePosition] = temp;
                nextNegativePosition++;
            }
        }
        System.out.println(Arrays.toString(numbers));
        scanner.close();
    }
}
