// Two pointers solve two-sum on a sorted array.
public class TwoSumSorted {
 public static int[] find(int[]a,int target){int l=0,r=a.length-1;while(l<r){int sum=a[l]+a[r];if(sum==target)return new int[]{l,r};if(sum<target)l++;else r--; // Adjust the pointer whose side cannot reach target.
  }return new int[]{-1,-1};}
}