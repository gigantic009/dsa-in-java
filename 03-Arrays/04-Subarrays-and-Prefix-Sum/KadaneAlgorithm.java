import java.util.Scanner;

public class KadaneAlgorithm {
    public static int maxSubarraySum(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Empty array");
        }
        int current = numbers[0];
        int best = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            current = Math.max(numbers[i], current + numbers[i]);
            best = Math.max(best, current);
        }
        return best;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Size must be positive.");
            sc.close();
            return;
        }
        int[] numbers = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Maximum subarray sum: " + maxSubarraySum(numbers));
        sc.close();
    }
}
