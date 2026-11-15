/**
 * Question: Given an array, reverse its elements in place.
 * Companies listed in the supplied Apna College sheet: Infosys, Moonfrog Labs.
 * Note: These are source-reported associations, not independently verified interview claims.
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
