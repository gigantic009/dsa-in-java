/*
 * Binary search requires a sorted array.
 * Time: O(log n) | Auxiliary space: O(1)
 */
import java.util.Scanner;

public class BinarySearch {
    public static int search(int[] arr, int target) {
        // The candidate range is inclusive: every index from left through right.
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            // This form avoids overflow from adding left and right directly.
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // Sorted order lets us discard the half that cannot contain target.
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // The candidate interval became empty; the target is not present.
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sorted array size: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid size.");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Target: ");
        int target = sc.nextInt();
        System.out.println("Index: " + search(arr, target));

        sc.close();
    }
}
