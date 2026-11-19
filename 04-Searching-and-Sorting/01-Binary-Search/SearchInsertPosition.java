/*
Problem: Search Insert Position (LeetCode 35)
Return target index, or insertion index to preserve sorted order.
Example: [1,3,5,6], target=2 -> 1
Time O(log n), Space O(1)
https://leetcode.com/problems/search-insert-position/
*/
public class SearchInsertPosition {
    static int searchInsert(int[] a,int target) {
        int lo=0,hi=a.length;
        while(lo<hi){int mid=lo+(hi-lo)/2;if(a[mid]<target)lo=mid+1;else hi=mid;}
        return lo;
    }
    public static void main(String[] args){System.out.println(searchInsert(new int[]{1,3,5,6},2));}
}