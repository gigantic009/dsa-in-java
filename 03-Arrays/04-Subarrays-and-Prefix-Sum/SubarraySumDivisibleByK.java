/*
 * Problem: Count the number of subarrays whose sum is divisible by k.
 * LeetCode: #974
 * Companies: Not listed
 */
import java.util.*;
public class SubarraySumDivisibleByK {
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt(),k=s.nextInt();if(k==0){System.out.println("k must be non-zero");return;}Map<Integer,Long> f=new HashMap<>();f.put(0,1L);long sum=0,ans=0;for(int i=0;i<n;i++){sum+=s.nextLong();int r=(int)((sum%k+k)%k);ans+=f.getOrDefault(r,0L);f.put(r,f.getOrDefault(r,0L)+1);}System.out.println(ans);}
}