/*
 * Problem: Find the minimum element in a sorted array that has been rotated.
 * LeetCode: #153
 * Companies: Adobe, Amazon, Microsoft, Morgan Stanley, Samsung, Snapdeal, Times Internet
 */
import java.util.*;
public class FindMinimumRotatedSortedArray {
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();if(n==0){System.out.println("Array is empty");return;}int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();int l=0,r=n-1;while(l<r){int m=l+(r-l)/2;if(a[m]>a[r])l=m+1;else if(a[m]<a[r])r=m;else r--;}System.out.println(a[l]);}
}