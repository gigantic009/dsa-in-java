/*
 * Problem: Reverse the given array in place and print the resulting order.
 * LeetCode: Not available
 * Companies: Infosys, Moonfrog Labs
 * Time: O(n) | Auxiliary space: O(1)
 */
import java.util.*;
public class ReverseArray {
 public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=sc.nextInt();for(int l=0,r=n-1;l<r;l++,r--){int t=a[l];a[l]=a[r];a[r]=t;}System.out.println(Arrays.toString(a));}
}