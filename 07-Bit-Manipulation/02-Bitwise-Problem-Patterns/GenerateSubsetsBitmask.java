import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** Generates all subsets by treating each bitmask as a subset selection. */
public class GenerateSubsetsBitmask {

    // Time complexity: O(n * 2^n), because each mask checks every element.
    public static List<List<Integer>> subsets(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Input array must not be null.");
        }
        // Explicit cap protects against exponential memory/time consumption.
        if (nums.length > 20) {
            throw new IllegalArgumentException("Bitmask subset generation is limited to 20 elements.");
        }
        List<List<Integer>> result = new ArrayList<>();
        int limit = 1 << nums.length; // n elements produce 2^n subset masks.

        for (int mask = 0; mask < limit; mask++) {
            List<Integer> subset = new ArrayList<>();

            for (int i = 0; i < nums.length; i++) {
                // If bit i is set, include nums[i] in this subset.
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

        System.out.print("Enter array size (at most 20 for bitmask enumeration): ");
        int n = scanner.nextInt();

        if (n < 0 || n > 20) {
            System.out.println("Please enter a size between 0 and 20.");
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