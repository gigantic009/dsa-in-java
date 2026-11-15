/*
 * Problem: Find the median of two sorted arrays of equal size.
 * LeetCode: #4 (generalized version)
 * Companies: Not listed
 */
import java.util.*;
public class MedianOfEqualSortedArrays {
    public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();int[] a=new int[n],b=new int[n];for(int i=0;i<n;i++)a[i]=sc.nextInt();for(int i=0;i<n;i++)b[i]=sc.nextInt();if(n==0){System.out.println("Arrays must be non-empty");return;}int i=0,j=0,prev=0,cur=0;for(int c=0;c<=n;c++){prev=cur;if(i<n&&(j>=n||a[i]<=b[j]))cur=a[i++];else cur=b[j++];}System.out.println(((long)prev+cur)/2.0);}
}