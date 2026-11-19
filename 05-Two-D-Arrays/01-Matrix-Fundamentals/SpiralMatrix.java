/* LeetCode 54: Spiral Matrix. Return traversal in spiral order. O(m*n) time. https://leetcode.com/problems/spiral-matrix/ */
import java.util.*;
public class SpiralMatrix {
 static List<Integer> spiral(int[][] a){
  List<Integer> o=new ArrayList<>(); int top=0,bottom=a.length-1,left=0,right=a[0].length-1;
  while(top<=bottom&&left<=right){
   for(int j=left;j<=right;j++)o.add(a[top][j]); top++;
   for(int i=top;i<=bottom;i++)o.add(a[i][right]); right--;
   if(top<=bottom){for(int j=right;j>=left;j--)o.add(a[bottom][j]);bottom--;}
   if(left<=right){for(int i=bottom;i>=top;i--)o.add(a[i][left]);left++;}
  }return o;
 }
 public static void main(String[]x){System.out.println(spiral(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));}
}