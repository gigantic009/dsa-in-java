/*
 * Problem: Merge all overlapping intervals and return the resulting non-overlapping intervals.
 * LeetCode: #56
 * Companies: Not listed
 */
import java.util.*;
public class MergeIntervals {
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[][] a=new int[n][2];for(int i=0;i<n;i++){a[i][0]=s.nextInt();a[i][1]=s.nextInt();}Arrays.sort(a,Comparator.comparingInt(x->x[0]));List<int[]> out=new ArrayList<>();for(int[] x:a){if(out.isEmpty()||out.get(out.size()-1)[1]<x[0])out.add(x.clone());else out.get(out.size()-1)[1]=Math.max(out.get(out.size()-1)[1],x[1]);}for(int[] x:out)System.out.println(x[0]+" "+x[1]);}
}