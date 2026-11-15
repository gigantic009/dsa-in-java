/*
 * Problem: Print the minimum and maximum elements of the input array.
 * LeetCode: Not available
 * Companies: Not listed
 */
import java.util.*;
public class SmallestAndLargestArrayElement {
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();if(n==0){System.out.println("Empty");return;}int mn=Integer.MAX_VALUE,mx=Integer.MIN_VALUE;for(int i=0;i<n;i++){int x=s.nextInt();mn=Math.min(mn,x);mx=Math.max(mx,x);}System.out.println(mn+" "+mx);}
}