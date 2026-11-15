/*
 * Problem: Rearrange an array so positive and negative values alternate,
 * using constant extra space where possible.
 * LeetCode: Not available
 * Companies: Not listed
 * Time: O(n^2) worst case | Auxiliary space: O(1)
 */
import java.util.Arrays;
import java.util.Scanner;

public class AlternatingPositiveNegative {

    public static void rearrange(int[] arr) {
        int misplaced = -1;

        for (int i = 0; i < arr.length; i++) {
            boolean currentIsMisplaced =
                    (i % 2 == 0 && arr[i] >= 0)
                    || (i % 2 == 1 && arr[i] < 0);

            if (misplaced != -1 && currentIsMisplaced
                    && ((arr[misplaced] >= 0 && arr[i] < 0)
                    || (arr[misplaced] < 0 && arr[i] >= 0))) {

                int temp = arr[misplaced];
                arr[misplaced] = arr[i];
                arr[i] = temp;
                misplaced = -1;
            }

            if (misplaced == -1 && currentIsMisplaced) {
                misplaced = i;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        rearrange(arr);

        System.out.println(Arrays.toString(arr));
        scanner.close();
    }
}
