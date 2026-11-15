/*
 * Problem: Given a sorted array and a target, return the target's index or -1 if it is absent.
 * LeetCode: #704
 * Companies: Not listed
 * Time: O(log n) | Auxiliary space: O(1)
 */
import java.util.Scanner;
public class BinarySearch {
 public static int search(int[] a,int target){int l=0,r=a.length-1;while(l<=r){int m=l+(r-l)/2;if(a[m]==target)return m;if(a[m]<target)l=m+1;else r=m-1;}return -1;}
 public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=sc.nextInt();int target=sc.nextInt();System.out.println(search(a,target));}
}