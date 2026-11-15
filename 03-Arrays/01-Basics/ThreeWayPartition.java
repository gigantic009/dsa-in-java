/*
 * Problem: Rearrange an array into three regions: values below a, values from a through b, and values above b.
 * LeetCode: Not available
 * Companies: Not listed
 */
import java.util.*;
public class ThreeWayPartition {
    public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=sc.nextInt();int low=sc.nextInt(),high=sc.nextInt();if(low>high){System.out.println("Invalid range");return;}int l=0,m=0,r=n-1;while(m<=r){if(a[m]<low){int t=a[l];a[l++]=a[m];a[m++]=t;}else if(a[m]>high){int t=a[m];a[m]=a[r];a[r--]=t;}else m++;}System.out.println(Arrays.toString(a));}
}