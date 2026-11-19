// Divide-and-conquer binary search on a sorted array.
public class BinarySearch {
    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2; // Avoids overflow from low + high.
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) low = mid + 1; // Target must be in the right half.
            else high = mid - 1; // Target must be in the left half.
        }
        return -1;
    }
    public static void main(String[] args) { System.out.println(search(new int[]{1,3,5,7},5)); }
}