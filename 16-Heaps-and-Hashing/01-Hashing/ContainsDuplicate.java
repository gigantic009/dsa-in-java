// Detect duplicates using a HashSet. Expected O(n) time, O(n) space.
import java.util.HashSet;
public class ContainsDuplicate {
 public static boolean containsDuplicate(int[]a){if(a==null)throw new IllegalArgumentException("Array required");HashSet<Integer>s=new HashSet<>();for(int x:a)if(!s.add(x))return true;return false;}
 public static void main(String[]args){System.out.println(containsDuplicate(new int[]{1,2,3,1}));}
}