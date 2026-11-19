/**
 * Bubble sort: adjacent swaps.
 * Time: O(n^2) | Space: O(1)
 */
import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort {
    static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // Stop if the array is already sorted.
            if (!swapped) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid size");
            sc.close();
            return;
        }
        int[] array = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        sort(array);
        System.out.println(Arrays.toString(array));
        sc.close();
    }
}
