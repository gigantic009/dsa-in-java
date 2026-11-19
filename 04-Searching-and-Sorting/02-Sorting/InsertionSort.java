/**
 * Insertion sort: inserts each element into its correct position
 * within the sorted prefix.
 * Time: O(n^2) worst case | Space: O(1)
 */
import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            int j = i - 1;

            // Shift larger elements one position to the right.
            while (j >= 0 && array[j] > value) {
                array[j + 1] = array[j];
                j--;
            }

            // Insert value into its correct position.
            array[j + 1] = value;
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
