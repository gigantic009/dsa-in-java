/*
LeetCode 69: Sqrt(x), floor square root. x=8 -> 2.
Binary search using long to avoid overflow. O(log x), O(1).
https://leetcode.com/problems/sqrtx/
*/
public class SqrtX {static int mySqrt(int x){long l=0,r=x;while(l<=r){long m=(l+r)/2;if(m*m<=x)l=m+1;else r=m-1;}return(int)r;}public static void main(String[]x){System.out.println(mySqrt(8));}}