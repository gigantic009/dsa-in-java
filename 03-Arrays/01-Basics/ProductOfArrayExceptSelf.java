import java.util.Scanner;

public class ProductOfArrayExceptSelf {
    public static long[] productExceptSelf(int[] nums) {
        int n = nums.length;
        long[] answer = new long[n];
        long prefix = 1;

        for (int i = 0; i < n; i++) {
            answer[i] = prefix;
            prefix *= nums[i];
        }

        long suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffix;
            suffix *= nums[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) nums[i] = scanner.nextInt();

        long[] result = productExceptSelf(nums);
        for (long value : result) System.out.print(value + " ");
        System.out.println();
        scanner.close();
    }
}