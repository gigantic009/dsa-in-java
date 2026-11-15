/*
 * Problem: Find the kth smallest and kth largest elements in an array.
 * LeetCode: #215 (separate order-statistic queries)
 * Companies: Not listed
 */
import java.util.*;
public class FindKthMinMax {
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();int k=s.nextInt();if(k<1||k>n){System.out.println("Invalid k");return;}Arrays.sort(a);System.out.println("Kth smallest: "+a[k-1]);System.out.println("Kth largest: "+a[n-k]);}
}