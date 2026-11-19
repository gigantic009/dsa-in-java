// Find the value occurring once when every other value occurs twice.
import java.util.Scanner;

public class SingleNumber {
    public static int find(int[] nums) {
        int answer = 0;
        // XOR cancels identical pairs because x ^ x = 0 and 0 ^ x = x.
        for (int value : nums) {
            answer ^= value;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Array size must be positive.");
            scanner.close();
            return;
        }

        int[] nums = new int[n];
        System.out.println("Enter array elements (one value occurs once, others twice):");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("Unique value: " + find(nums));
        scanner.close();
    }
}