/*
 * Problem: Rearrange an array so that all negative values appear on one side.
 * LeetCode: Not available
 * Companies: Not listed
 */
import java.util.*;
public class MoveNegativesToOneSide {
    public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=sc.nextInt();int j=0;for(int i=0;i<n;i++)if(a[i]<0){int t=a[i];a[i]=a[j];a[j++]=t;}System.out.println(Arrays.toString(a));}
}