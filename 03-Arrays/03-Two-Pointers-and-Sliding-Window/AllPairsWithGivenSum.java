/*
 * Problem: Print all distinct value pairs in an integer array whose sum equals the target.
 * LeetCode: Not available
 * Companies: Not listed
 */
import java.util.*;
public class AllPairsWithGivenSum {
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();int t=s.nextInt();Arrays.sort(a);int l=0,r=n-1;Set<String> out=new LinkedHashSet<>();while(l<r){long sum=(long)a[l]+a[r];if(sum==t){out.add(a[l]+", "+a[r]);int x=a[l],y=a[r];while(l<r&&a[l]==x)l++;while(l<r&&a[r]==y)r--;}else if(sum<t)l++;else r--;}for(String p:out)System.out.println(p);}
}