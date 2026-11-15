/*
 * Problem: Find the minimum swaps required to bring all elements less than or equal to k together.
 * LeetCode: Not available
 * Companies: Not listed
 */
import java.util.*;
public class MinimumSwapsToGroupK {
    public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=sc.nextInt();int k=sc.nextInt(),good=0;for(int x:a)if(x<=k)good++;if(good<=1){System.out.println(0);return;}int bad=0;for(int i=0;i<good;i++)if(a[i]>k)bad++;int ans=bad;for(int i=good;i<n;i++){if(a[i-good]>k)bad--;if(a[i]>k)bad++;ans=Math.min(ans,bad);}System.out.println(ans);}
}