/** Insertion sort: insert into sorted prefix. Time O(n^2), best O(n), space O(1). */
import java.util.Arrays;import java.util.Scanner;
public class InsertionSort {
 static void sort(int[]nums){for(int i=1;i<nums.length;i++){int value=nums[i],j=i-1;while(j>=0&&nums[j]>value){nums[j+1]=nums[j];j--;}nums[j+1]=value;}}
 public static void main(String[]args){Scanner sc=new Scanner(System.in);System.out.print("Enter array size: ");int n=sc.nextInt();if(n<0){System.out.println("Invalid size.");sc.close();return;}int[]nums=new int[n];System.out.println("Enter elements:");for(int i=0;i<n;i++)nums[i]=sc.nextInt();sort(nums);System.out.println(Arrays.toString(nums));sc.close();}
}