/*
 * Problem: Given tower heights and a positive integer k, add or subtract k from each height to minimize the difference between maximum and minimum.
 * LeetCode: Not available
 * Companies: Not listed
 */
import java.util.*;
public class MinimizeMaximumHeightDifference {
    public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt(),k=sc.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=sc.nextInt();if(n<=1){System.out.println(0);return;}Arrays.sort(a);long ans=(long)a[n-1]-a[0];for(int i=1;i<n;i++){if(a[i]-k<0)continue;long high=Math.max((long)a[n-1]-k,(long)a[i-1]+k),low=Math.min((long)a[0]+k,(long)a[i]-k);ans=Math.min(ans,high-low);}System.out.println(ans);}
}