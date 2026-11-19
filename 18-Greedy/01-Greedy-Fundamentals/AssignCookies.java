// Maximize satisfied children by assigning each a cookie at least their greed.
// Time O(n log n + m log m).
import java.util.Arrays;
public class AssignCookies {
 static int count(int[]g,int[]s){if(g==null||s==null)throw new IllegalArgumentException();Arrays.sort(g);Arrays.sort(s);int i=0,j=0;while(i<g.length&&j<s.length){if(s[j]>=g[i])i++;j++;}return i;}
 public static void main(String[]args){System.out.println(count(new int[]{1,2,3},new int[]{1,1}));}
}