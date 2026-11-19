/*
LeetCode 33: Search in Rotated Sorted Array. Example [4,5,6,7,0,1,2], target 0 -> 4.
Identify sorted half each step. Time O(log n), space O(1).
https://leetcode.com/problems/search-in-rotated-sorted-array/
*/
public class SearchRotatedArray { static int search(int[] a,int t){int l=0,r=a.length-1;while(l<=r){int m=l+(r-l)/2;if(a[m]==t)return m;if(a[l]<=a[m]){if(a[l]<=t&&t<a[m])r=m-1;else l=m+1;}else{if(a[m]<t&&t<=a[r])l=m+1;else r=m-1;}}return -1;}public static void main(String[]x){System.out.println(search(new int[]{4,5,6,7,0,1,2},0));}}