/*
 * Problem: Find the maximum profit from at most two buy-and-sell stock transactions.
 * LeetCode: #123
 * Companies: Not listed
 */
import java.util.*;
public class MaximumProfitTwoTransactions {
    public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();int[] p=new int[n];for(int i=0;i<n;i++)p[i]=sc.nextInt();long[] left=new long[n],right=new long[n];long min=Long.MAX_VALUE,best=0;for(int i=0;i<n;i++){min=Math.min(min,p[i]);best=Math.max(best,p[i]-min);left[i]=best;}long max=Long.MIN_VALUE;best=0;for(int i=n-1;i>=0;i--){max=Math.max(max,p[i]);best=Math.max(best,max-p[i]);right[i]=best;}long ans=0;for(int i=0;i<n;i++)ans=Math.max(ans,left[i]+right[i]);System.out.println(ans);}
}