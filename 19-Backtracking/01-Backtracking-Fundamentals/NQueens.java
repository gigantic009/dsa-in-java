// Backtracking placement of n queens with column/diagonal conflict checks.
import java.util.*;
public class NQueens {
 public static List<List<String>> solve(int n){List<List<String>>out=new ArrayList<>();char[][]b=new char[n][n];for(char[]r:b)Arrays.fill(r,'.');place(0,b,out);return out;}
 private static void place(int row,char[][]b,List<List<String>>out){if(row==b.length){List<String>copy=new ArrayList<>();for(char[]r:b)copy.add(new String(r));out.add(copy);return;}
  for(int col=0;col<b.length;col++){if(safe(row,col,b)){b[row][col]='Q';place(row+1,b,out);b[row][col]='.'; // Undo placement so the next candidate is explored.
  }}
 }
 private static boolean safe(int r,int c,char[][]b){for(int i=0;i<r;i++)if(b[i][c]=='Q'||(c-(r-i)>=0&&b[i][c-(r-i)]=='Q')||(c+(r-i)<b.length&&b[i][c+(r-i)]=='Q'))return false;return true;}
}