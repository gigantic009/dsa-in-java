/*
 * Problem: Find the contiguous subarray with the largest product and print that product.
 * LeetCode: #152
 * Companies: Amazon, D-E-Shaw, Microsoft, Morgan Stanley, OYO Rooms, Google
 */
import java.util.*;
public class MaximumProductSubarray {
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();if(n==0){System.out.println("Array is empty");return;}long x=s.nextLong(),max=x,min=x,ans=x;for(int i=1;i<n;i++){x=s.nextLong();if(x<0){long t=max;max=min;min=t;}max=Math.max(x,max*x);min=Math.min(x,min*x);ans=Math.max(ans,max);}System.out.println(ans);}
}