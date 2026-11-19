// Quickselect finds the kth largest element without fully sorting.
import java.util.Scanner;

public class QuickSelect {
    public static int kthLargest(int[] nums, int k) {
        int target = nums.length - k; // Convert kth-largest to ascending index.
        return select(nums, 0, nums.length - 1, target);
    }

    private static int select(int[] nums, int left, int right, int target) {
        int pivot = nums[right];
        int storeIndex = left;

        // Move values smaller than the pivot to the left side.
        for (int i = left; i < right; i++) {
            if (nums[i] < pivot) {
                int temp = nums[i];
                nums[i] = nums[storeIndex];
                nums[storeIndex] = temp;
                storeIndex++;
            }
        }

        // Place the pivot at its partition position.
        int temp = nums[storeIndex];
        nums[storeIndex] = nums[right];
        nums[right] = temp;

        if (storeIndex == target) {
            return nums[storeIndex];
        }
        if (storeIndex > target) {
            return select(nums, left, storeIndex - 1, target);
        }
        return select(nums, storeIndex + 1, right, target);
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
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.print("Enter k (1 = largest): ");
        int k = scanner.nextInt();
        if (k < 1 || k > n) {
            System.out.println("k must be between 1 and array size.");
        } else {
            System.out.println("Kth largest: " + kthLargest(nums, k));
        }
        scanner.close();
    }
}