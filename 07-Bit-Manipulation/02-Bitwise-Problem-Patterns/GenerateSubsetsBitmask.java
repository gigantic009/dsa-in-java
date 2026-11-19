// Generate every subset of an array using binary masks.
import java.util.*;
public class GenerateSubsetsBitmask {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int limit = 1 << nums.length; // n elements create 2^n possible masks.
        for (int mask = 0; mask < limit; mask++) {
            List<Integer> subset = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if ((mask & (1 << i)) != 0) subset.add(nums[i]); // Mask bit decides inclusion.
            }
            result.add(subset);
        }
        return result;
    }
    public static void main(String[] args) { System.out.println(subsets(new int[]{1,2,3})); }
}