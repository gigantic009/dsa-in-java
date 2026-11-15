/**
 * Question: Given an array, find its minimum and maximum elements.
 * Companies listed in the supplied Apna College sheet: ABCO, Accolite, Amazon, Cisco, Hike, Microsoft, Snapdeal, VMWare, Google, Adobe.
 * Note: These are source-reported associations, not independently verified interview claims.
 */
public class MaximumAndMinimum {
    public static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 4, 1, 6};
        int[] result = findMinMax(arr);

        System.out.println("Minimum: " + result[0]);
        System.out.println("Maximum: " + result[1]);
    }
}
