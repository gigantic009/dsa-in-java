/*
 * Problem: Arrange non-negative integers to form the largest possible concatenated number.
 * LeetCode: #179
 * Companies: Not listed
 */
import java.util.*;
public class ArrangeNumbersForLargest {
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();String[] a=new String[n];for(int i=0;i<n;i++)a[i]=s.next();Arrays.sort(a,(x,y)->(y+x).compareTo(x+y));if(n==0){System.out.println("");return;}if(a[0].equals("0")){System.out.println("0");return;}StringBuilder b=new StringBuilder();for(String x:a)b.append(x);System.out.println(b);}
}