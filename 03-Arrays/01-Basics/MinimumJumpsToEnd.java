/*
 * Problem: Given non-negative values where each value is the maximum jump length from that position, find the minimum jumps to reach the last index.
 * LeetCode: #45
 * Companies: Not listed
 */
import java.util.*;
public class MinimumJumpsToEnd {
    public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=sc.nextInt();if(n<=1){System.out.println(0);return;}int jumps=0,end=0,far=0;for(int i=0;i<n-1;i++){far=Math.max(far,i+a[i]);if(i==end){if(far==end){System.out.println(-1);return;}jumps++;end=far;if(end>=n-1)break;}}System.out.println(jumps);}
}