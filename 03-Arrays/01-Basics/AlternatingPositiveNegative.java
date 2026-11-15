/*
 * Problem: Rearrange an array so positive and negative values alternate, using constant extra space where possible.
 * LeetCode: Not available
 * Companies: Not listed
 */
import java.util.*;
public class AlternatingPositiveNegative {
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();int wrong=-1;for(int i=0;i<n;i++){if(wrong!=-1&&((a[wrong]>=0&&a[i]<0)||(a[wrong]<0&&a[i]>=0))){int t=a[wrong];a[wrong]=a[i];a[i]=t;wrong=-1;}if(wrong==-1&&((i%2==0&&a[i]>=0)||(i%2==1&&a[i]<0)))wrong=i;}System.out.println(Arrays.toString(a));}
}