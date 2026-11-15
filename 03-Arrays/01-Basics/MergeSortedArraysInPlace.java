/*
 * Problem: Merge two sorted arrays so that their combined sorted values occupy the two arrays, without an extra array.
 * LeetCode: #88 (related merge problem)
 * Companies: Not listed
 */
import java.util.*;
public class MergeSortedArraysInPlace {
 static void swap(int[] a,int[] b,int i,int j){int t=a[i];a[i]=b[j];b[j]=t;}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();int m=s.nextInt();int[] b=new int[m];for(int i=0;i<m;i++)b[i]=s.nextInt();int gap=(n+m+1)/2;while(gap>0){int i=0,j=gap;while(j<n+m){int x=i<n?a[i]:b[i-n],y=j<n?a[j]:b[j-n];if(x>y){if(i<n&&j<n)swap(a,a,i,j);else if(i<n)swap(a,b,i,j-n);else swap(b,b,i-n,j-n);}i++;j++;}if(gap==1)break;gap=(gap+1)/2;}System.out.println(Arrays.toString(a));System.out.println(Arrays.toString(b));}
}