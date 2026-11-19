// Generate every subset of an array using binary masks.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateSubsetsBitmask {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int limit = 1 << nums.length; // There are 2^n possible subsets.

        for (int mask = 0; mask < limit; mask++) {
            List<Integer> subset = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                // A set bit means this element belongs in the current subset.
                if ((mask & (1 << i)) != 0) {
                    subset.add(nums[i]);
                }
            }
            result.add(subset);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size (small enough for bitmask enumeration): ");
        int n = scanner.nextInt();
        if (n < 0 || n >= 31) {
            System.out.println("Please enter a size between 0 and 30.");
            scanner.close();
            return;
        }

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("Subsets: " + subsets(nums));
        scanner.close();
    }
}