/*
 * Problem: Search for a target in a rotated sorted array with distinct values; print its index or -1.
 * LeetCode: #33
 * Companies: Microsoft, Google, Adobe, Amazon, D-E-Shaw, Flipkart, Hike, Intuit, MakeMyTrip, Pay
 */
import java.util.*;
public class SearchRotatedSortedArray {
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();int t=s.nextInt(),l=0,r=n-1,ans=-1;while(l<=r){int m=l+(r-l)/2;if(a[m]==t){ans=m;break;}if(a[l]<=a[m]){if(a[l]<=t&&t<a[m])r=m-1;else l=m+1;}else{if(a[m]<t&&t<=a[r])l=m+1;else r=m-1;}}System.out.println(ans);}
}