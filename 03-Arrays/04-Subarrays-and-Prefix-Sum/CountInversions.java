/*
 * Problem: Count pairs (i, j) such that i < j and array[i] > array[j].
 * LeetCode: Not available
 * Companies: Not listed
 */
import java.util.*;
public class CountInversions {
 static long sort(int[] a,int[] t,int l,int r){if(l>=r)return 0;int m=(l+r)/2;long c=sort(a,t,l,m)+sort(a,t,m+1,r);int i=l,j=m+1,k=l;while(i<=m&&j<=r){if(a[i]<=a[j])t[k++]=a[i++];else{t[k++]=a[j++];c+=m-i+1;}}while(i<=m)t[k++]=a[i++];while(j<=r)t[k++]=a[j++];for(i=l;i<=r;i++)a[i]=t[i];return c;}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();System.out.println(sort(a,new int[n],0,n-1));}
}