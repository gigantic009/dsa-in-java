/*
 * Problem: Find the length of the longest consecutive sequence in an unsorted array.
 * LeetCode: #128
 * Companies: Not listed
 */
import java.util.*;
public class LongestConsecutiveSequence {
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();Set<Integer> set=new HashSet<>();for(int i=0;i<n;i++)set.add(s.nextInt());int best=0;for(int x:set)if(x==Integer.MIN_VALUE||!set.contains(x-1)){int len=1;long y=(long)x+1;while(y<=Integer.MAX_VALUE&&set.contains((int)y)){len++;y++;}best=Math.max(best,len);}System.out.println(best);}
}