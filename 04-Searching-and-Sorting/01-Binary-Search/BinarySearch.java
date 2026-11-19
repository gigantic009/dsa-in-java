/*
Problem: Binary Search (LeetCode 704)
Given a sorted integer array and target, return its index or -1.
Example: nums=[-1,0,3,5,9,12], target=9 -> 4
Approach: Maintain a search interval and halve it each iteration.
Time: O(log n), Space: O(1)
LeetCode: https://leetcode.com/problems/binary-search/
*/
import java.util.*;
public class BinarySearch {
    static int search(int[] nums, int target) {
        int lo=0, hi=nums.length-1;
        while(lo<=hi) {
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]<target) lo=mid+1; else hi=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a={-1,0,3,5,9,12};
        System.out.println(search(a,9)); // 4
        System.out.println(search(a,2)); // -1
    }
}