/*
 * Problem: Print all distinct value pairs whose sum equals the target.
 */
import java.util.Arrays;
import java.util.Scanner;

public class AllPairsWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Array size must be non-negative");
            sc.close();
            return;
        }
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Arrays.sort(numbers);
        int left = 0;
        int right = n - 1;
        while (left < right) {
            long sum = (long) numbers[left] + numbers[right];
            if (sum == target) {
                System.out.println(numbers[left] + " " + numbers[right]);
                int leftValue = numbers[left];
                int rightValue = numbers[right];
                while (left < right && numbers[left] == leftValue) {
                    left++;
                }
                while (left < right && numbers[right] == rightValue) {
                    right--;
                }
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        sc.close();
    }
}
