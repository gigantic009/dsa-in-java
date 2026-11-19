/**
 * Merges two sorted arrays into a single sorted array.
 * Time: O(n + m) | Auxiliary space: O(n + m)
 */
import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArrays {

    static int[] merge(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;

        // Merge while both arrays still have elements.
        while (i < first.length && j < second.length) {
            if (first[i] <= second[j]) {
                result[k++] = first[i++];
            } else {
                result[k++] = second[j++];
            }
        }

        // Copy any remaining elements from the first array.
        while (i < first.length) {
            result[k++] = first[i++];
        }

        // Copy any remaining elements from the second array.
        while (j < second.length) {
            result[k++] = second[j++];
        }

        return result;
    }

    static int[] readArray(Scanner sc, String name) {
        System.out.print(name + " array size: ");
        int n = sc.nextInt();

        if (n < 0) {
            throw new IllegalArgumentException("Invalid array size");
        }

        int[] array = new int[n];

        System.out.println("Enter " + name + " sorted values:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] first = readArray(sc, "First");
        int[] second = readArray(sc, "Second");

        System.out.println(Arrays.toString(merge(first, second)));

        sc.close();
    }
}
