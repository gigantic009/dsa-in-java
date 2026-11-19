/**
 * Sorts an array containing only 0, 1, and 2 using the Dutch National Flag algorithm.
 * Time: O(n) | Auxiliary space: O(1)
 */
import java.util.Arrays;
import java.util.Scanner;

public class Sort012 {

    static void sort(int[] array) {
        int low = 0, mid = 0, high = array.length - 1;

        while (mid <= high) {
            if (array[mid] == 0) {
                swap(array, low, mid);
                low++;
                mid++;
            } else if (array[mid] == 1) {
                mid++;
            } else if (array[mid] == 2) {
                swap(array, mid, high);
                high--;
            } else {
                throw new IllegalArgumentException("Only 0, 1, and 2 are allowed");
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
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

        System.out.println("Enter only 0, 1, and 2:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        try {
            sort(array);
            System.out.println(Arrays.toString(array));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }

        sc.close();
    }
}
