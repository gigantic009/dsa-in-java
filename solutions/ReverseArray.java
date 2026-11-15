/**
 * Question:
 * Given an array, reverse its elements in place.
 *
 * LeetCode: Not available (no exact problem number verified).
 *
 * Companies:
 * Infosys, Moonfrog Labs
 */
public class ReverseArray {
    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
