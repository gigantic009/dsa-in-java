/*
 * Problem: Find the median of two sorted arrays of possibly different lengths.
 * LeetCode: #4
 * Companies: Not listed
 */
import java.util.*;
public class MedianOfTwoSortedArrays {
    static double median(int[] a,int[] b){if(a.length>b.length)return median(b,a);int m=a.length,n=b.length,lo=0,hi=m;while(lo<=hi){int i=(lo+hi)/2,j=(m+n+1)/2-i;int al=i==0?Integer.MIN_VALUE:a[i-1],ar=i==m?Integer.MAX_VALUE:a[i],bl=j==0?Integer.MIN_VALUE:b[j-1],br=j==n?Integer.MAX_VALUE:b[j];if(al<=br&&bl<=ar)return ((m+n)%2==1)?Math.max(al,bl):((long)Math.max(al,bl)+Math.min(ar,br))/2.0;if(al>br)hi=i-1;else lo=i+1;}throw new IllegalArgumentException("Arrays must be sorted");}
    public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=sc.nextInt();int m=sc.nextInt();int[] b=new int[m];for(int i=0;i<m;i++)b[i]=sc.nextInt();if(n+m==0){System.out.println("Both arrays are empty");return;}System.out.println(median(a,b));}
}