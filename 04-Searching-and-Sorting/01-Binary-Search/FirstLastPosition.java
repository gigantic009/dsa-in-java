/** LeetCode 34: locate first and last target indices. Two binary searches: O(log n). */
import java.util.Arrays;
public class FirstLastPosition {
    static int boundary(int[] nums,int target,boolean first) {
        int low=0,high=nums.length-1,answer=-1;
        while(low<=high) {
            int mid=low+(high-low)/2;
            if(nums[mid]==target) {
                answer=mid;
                if(first) high=mid-1; else low=mid+1;
            } else if(nums[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return answer;
    }
    static int[] searchRange(int[] nums,int target) {
        return new int[]{boundary(nums,target,true),boundary(nums,target,false)};
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5,7,7,8,8,10},8)));
    }
}