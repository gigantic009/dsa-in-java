// Return indices of two values that add up to target.
import java.util.*;
public class TwoSum {
 public static int[] find(int[] nums,int target){Map<Integer,Integer>seen=new HashMap<>();
  for(int i=0;i<nums.length;i++){int needed=target-nums[i];if(seen.containsKey(needed))return new int[]{seen.get(needed),i};seen.put(nums[i],i); // Store index for later complement lookup.
  }return new int[]{-1,-1};
 }
}