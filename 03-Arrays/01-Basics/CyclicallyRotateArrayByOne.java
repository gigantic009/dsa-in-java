/*
 * Problem: Rotate an array to the right by one position.
 * LeetCode: Not available
 * Companies: Not listed
 */
import java.util.*;
public class CyclicallyRotateArrayByOne {
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();if(n>1){int last=a[n-1];for(int i=n-1;i>0;i--)a[i]=a[i-1];a[0]=last;}System.out.println(Arrays.toString(a));}
}