/*
LeetCode 153: Find Minimum in Rotated Sorted Array. [3,4,5,1,2] -> 1.
Binary-search pivot. Time O(log n), space O(1).
https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
*/
public class RotatedArrayMinimum {static int findMin(int[]a){int l=0,r=a.length-1;while(l<r){int m=l+(r-l)/2;if(a[m]>a[r])l=m+1;else r=m;}return a[l];}public static void main(String[]x){System.out.println(findMin(new int[]{3,4,5,1,2}));}}