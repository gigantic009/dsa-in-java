/*
 * Problem: Find the minimum adjacent swaps needed to rearrange an array into a palindrome, or report that it is impossible.
 * LeetCode: Not available
 * Companies: Not listed
 * Assumption: The source title does not specify the operation; this implementation counts adjacent swaps.
 */
import java.util.*;
public class MinimumAdjacentSwapsToPalindrome {
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];Map<Integer,Integer> f=new HashMap<>();for(int i=0;i<n;i++){a[i]=s.nextInt();f.merge(a[i],1,Integer::sum);}int odd=0;for(int c:f.values())if(c%2==1)odd++;if(odd>1){System.out.println(-1);return;}long swaps=0;int l=0,r=n-1;while(l<r){int k=r;while(k>l&&a[k]!=a[l])k--;if(k==l){int t=a[l];a[l]=a[l+1];a[l+1]=t;swaps++;}else{while(k<r){int t=a[k];a[k]=a[k+1];a[k+1]=t;k++;swaps++;}l++;r--;}}System.out.println(swaps);}
}