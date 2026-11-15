/*
 * Problem: Determine whether an array contains a triplet whose sum equals a given target.
 * LeetCode: #15 (3Sum is the zero-target variant)
 * Companies: Not listed
 */
import java.util.*;
public class TripletSum {
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();long t=s.nextLong();Arrays.sort(a);boolean found=false;for(int i=0;i<n-2&&!found;i++){int l=i+1,r=n-1;while(l<r){long sum=(long)a[i]+a[l]+a[r];if(sum==t){found=true;break;}if(sum<t)l++;else r--;}}System.out.println(found?"Yes":"No");}
}