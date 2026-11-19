/**
 * Selection sort: repeatedly selects the smallest remaining element.
 * Time: O(n^2) | Auxiliary space: O(1)
 */
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;

            // Find the smallest element in the unsorted portion.
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap only when the minimum is not already in place.
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
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
