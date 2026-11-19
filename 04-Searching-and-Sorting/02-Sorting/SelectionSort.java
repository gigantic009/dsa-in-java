/** Selection sort: repeatedly select the minimum. Time O(n^2), space O(1). */
import java.util.Arrays;import java.util.Scanner;
public class SelectionSort {
 static void sort(int[]nums){for(int i=0;i<nums.length;i++){int minIndex=i;for(int j=i+1;j<nums.length;j++)if(nums[j]<nums[minIndex])minIndex=j;int temp=nums[i];nums[i]=nums[minIndex];nums[minIndex]=temp;}}
 public static void main(String[]args){Scanner sc=new Scanner(System.in);System.out.print("Enter array size: ");int n=sc.nextInt();if(n<0){System.out.println("Invalid size.");sc.close();return;}int[]nums=new int[n];System.out.println("Enter elements:");for(int i=0;i<n;i++)nums[i]=sc.nextInt();sort(nums);System.out.println(Arrays.toString(nums));sc.close();}
}