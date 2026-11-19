/** LeetCode 35: return target index or lower-bound insertion index. O(log n). */
public class SearchInsertPosition {
    static int searchInsert(int[] nums, int target) {
        int low=0, high=nums.length;
        while(low<high) {
            int mid=low+(high-low)/2;
            if(nums[mid]<target) low=mid+1; else high=mid;
        }
        return low;
    }
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6},2));
    }
}