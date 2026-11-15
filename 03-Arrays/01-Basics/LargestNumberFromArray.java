/*
 * Problem: Arrange the given non-negative integers so that they form the largest possible number.
 * LeetCode: #179
 * Companies: Barclays
 */
import java.util.*;
public class LargestNumberFromArray {
    public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();String[] a=new String[n];for(int i=0;i<n;i++){long v=sc.nextLong();if(v<0){System.out.println("Inputs must be non-negative");return;}a[i]=String.valueOf(v);}Arrays.sort(a,(x,y)->(y+x).compareTo(x+y));if(n==0){System.out.println("");return;}if(a[0].equals("0")){System.out.println("0");return;}StringBuilder s=new StringBuilder();for(String x:a)s.append(x);System.out.println(s);}
}