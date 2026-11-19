/*
 * Problem: Find the minimum and maximum values in an array in one traversal.
 * Time: O(n) | Auxiliary space: O(1)
 */
import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Size must be positive.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize both extrema from the first value instead of arbitrary sentinels.
        int min = arr[0];
        int max = arr[0];

        // Each remaining value can update the minimum, maximum, both, or neither.
        for (int i = 1; i < n; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        sc.close();
    }
}
