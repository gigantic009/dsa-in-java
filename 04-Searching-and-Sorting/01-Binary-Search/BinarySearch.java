/** Binary Search (704): sorted array search. O(log n) time, O(1) space. */
public class BinarySearch {
    static int search(int[] nums, int target) {
        int low=0, high=nums.length-1;
        while(low<=high) {
            int mid=low+(high-low)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]<target) low=mid+1; else high=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums={-1,0,3,5,9,12};
        System.out.println(search(nums,9)); // 4
        System.out.println(search(nums,2)); // -1
    }
}