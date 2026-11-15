/*
 * Problem: Determine whether the array contains a non-empty subarray whose sum is zero.
 * LeetCode: Not available
 * Companies: Not listed
 */
import java.util.*;
public class ZeroSumSubarray {
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();Set<Long> seen=new HashSet<>();seen.add(0L);long sum=0;boolean ok=false;for(int i=0;i<n;i++){sum+=s.nextLong();if(!seen.add(sum))ok=true;}System.out.println(ok?"Yes":"No");}
}