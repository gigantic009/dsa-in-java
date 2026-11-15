/*
 * Problem: Read an integer array and find its minimum and maximum values.
 * LeetCode: Not available
 * Companies: ABCO, Accolite, Amazon, Cisco, Hike, Microsoft, Snapdeal, VMWare, Google, Adobe
 * Time: O(n) | Auxiliary space: O(1)
 */
import java.util.Scanner;
public class ArrayMinMax {
 public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();if(n<=0){System.out.println("Array must be non-empty");return;}int first=sc.nextInt(),min=first,max=first;for(int i=1;i<n;i++){int x=sc.nextInt();min=Math.min(min,x);max=Math.max(max,x);}System.out.println("Minimum: "+min);System.out.println("Maximum: "+max);}
}