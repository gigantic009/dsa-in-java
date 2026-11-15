/*
 * Problem: Sort an array containing only 0, 1 and 2 without using a comparison sorting algorithm.
 * LeetCode: #75
 * Companies: Not listed
 */
import java.util.*;
public class Sort012 {
    public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();int[] a=new int[n];for(int i=0;i<n;i++){a[i]=sc.nextInt();if(a[i]<0||a[i]>2){System.out.println("Only 0, 1 and 2 are allowed");return;}}int low=0,mid=0,high=n-1;while(mid<=high){if(a[mid]==0){int t=a[low];a[low++]=a[mid];a[mid++]=t;}else if(a[mid]==1)mid++;else{int t=a[mid];a[mid]=a[high];a[high--]=t;}}System.out.println(Arrays.toString(a));}
}