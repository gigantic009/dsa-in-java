/** Bubble sort: adjacent swaps. Time O(n^2), best O(n), space O(1). */
import java.util.Arrays;import java.util.Scanner;
public class BubbleSort {
 static void sort(int[]nums){for(int i=0;i<nums.length;i++){boolean swapped=false;for(int j=0;j<nums.length-i-1;j++)if(nums[j]>nums[j+1]){int temp=nums[j];nums[j]=nums[j+1];nums[j+1]=temp;swapped=true;}if(!swapped)break;}}
 public static void main(String[]args){Scanner sc=new Scanner(System.in);System.out.print("Enter array size: ");int n=sc.nextInt();if(n<0){System.out.println("Invalid size.");sc.close();return;}int[]nums=new int[n];System.out.println("Enter elements:");for(int i=0;i<n;i++)nums[i]=sc.nextInt();sort(nums);System.out.println(Arrays.toString(nums));sc.close();}
}