import java.util.Scanner;

public class MaximumAndMinimum {
    public static int[] findMinMax(int[] arr) {
        int min = arr[0], max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Array must contain at least one element.");
            scanner.close();
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        int[] result = findMinMax(arr);
        System.out.println("Minimum: " + result[0]);
        System.out.println("Maximum: " + result[1]);
        scanner.close();
    }
}