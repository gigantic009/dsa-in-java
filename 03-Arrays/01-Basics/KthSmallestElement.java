/*
 * Problem: Find the kth smallest element in an unsorted array.
 * LeetCode: #215
 * Companies: Not listed
 */
import java.util.*;
public class KthSmallestElement {
    public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=sc.nextInt();int k=sc.nextInt();if(k<1||k>n){System.out.println("Invalid k");return;}Arrays.sort(a);System.out.println(a[k-1]);}
}