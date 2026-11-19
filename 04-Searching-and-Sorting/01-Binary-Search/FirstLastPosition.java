/*
Problem: Find First and Last Position of Element (LeetCode 34)
Return [first,last] or [-1,-1].
Example: [5,7,7,8,8,10], target=8 -> [3,4]
Approach: Two binary searches for lower and upper boundaries.
Time O(log n), Space O(1)
https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
*/
import java.util.Arrays;
public class FirstLastPosition {
    static int bound(int[] a,int t,boolean first){int l=0,r=a.length-1,ans=-1;while(l<=r){int m=l+(r-l)/2;if(a[m]==t){ans=m;if(first)r=m-1;else l=m+1;}else if(a[m]<t)l=m+1;else r=m-1;}return ans;}
    static int[] searchRange(int[] a,int t){return new int[]{bound(a,t,true),bound(a,t,false)};}
    public static void main(String[] args){System.out.println(Arrays.toString(searchRange(new int[]{5,7,7,8,8,10},8)));}
}