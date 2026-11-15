/*
 * Problem: Rearrange the array into the next lexicographically greater permutation; if none exists, return the smallest permutation.
 * LeetCode: #31
 * Companies: Uber, Goldman Sachs, Adobe
 */
import java.util.*;
public class NextPermutation {
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();int i=n-2;while(i>=0&&a[i]>=a[i+1])i--;if(i>=0){int j=n-1;while(a[j]<=a[i])j--;int t=a[i];a[i]=a[j];a[j]=t;}for(int l=i+1,r=n-1;l<r;l++,r--){int t=a[l];a[l]=a[r];a[r]=t;}System.out.println(Arrays.toString(a));}
}