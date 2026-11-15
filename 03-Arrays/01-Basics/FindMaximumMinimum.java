/*
 * Problem: Find the maximum and minimum values in an array in one traversal.
 * LeetCode: Not available
 * Companies: Not listed
 */
import java.util.*;
public class FindMaximumMinimum {
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();if(n==0){System.out.println("Array is empty");return;}int first=s.nextInt(),mn=first,mx=first;for(int i=1;i<n;i++){int x=s.nextInt();mn=Math.min(mn,x);mx=Math.max(mx,x);}System.out.println("Minimum: "+mn);System.out.println("Maximum: "+mx);}
}