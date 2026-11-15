/*
 * Problem: Reverse an integer array in place.
 * LeetCode: Not available
 * Companies: Infosys, Moonfrog Labs
 * Time: O(n) | Auxiliary space: O(1)
 */
import java.util.Scanner;

public class ReverseArray {
    public static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        reverse(arr);
        for (int value : arr) System.out.print(value + " ");
        System.out.println();
        scanner.close();
    }
}