// Quickselect finds the kth largest element without fully sorting.
// Time Complexity: Average O(n), worst O(n^2), depending on pivot choices.
// Space Complexity: O(1) extra space because the selection loop is iterative.
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class QuickSelect {
    public static int kthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 1 || k > nums.length) {
            throw new IllegalArgumentException("Invalid array or k");
        }

        // Convert kth-largest into its corresponding ascending-array index.
        int target = nums.length - k;
        return select(nums, 0, nums.length - 1, target);
    }

    private static int select(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int pivotIndex = ThreadLocalRandom.current().nextInt(left, right + 1);
            int pivot = nums[pivotIndex];

            // Group values smaller than, equal to, and greater than the pivot.
            int smaller = left;
            int current = left;
            int larger = right;

            while (current <= larger) {
                if (nums[current] < pivot) {
                    swap(nums, smaller, current);
                    smaller++;
                    current++;
                } else if (nums[current] > pivot) {
                    swap(nums, current, larger);
                    larger--;
                } else {
                    current++;
                }
            }

            // The target is in one of the three groups, so narrow the range.
            if (target < smaller) {
                right = smaller - 1;
            } else if (target > larger) {
                left = larger + 1;
            } else {
                return pivot;
            }
        }

        throw new IllegalStateException("Target index was not found");
    }

    private static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
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
