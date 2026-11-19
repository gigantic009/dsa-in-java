/** Sort Colors: Dutch National Flag. Time O(n), space O(1). */
import java.util.Arrays;import java.util.Scanner;
public class Sort012 {
 static void sort(int[]nums){int low=0,mid=0,high=nums.length-1;while(mid<=high){if(nums[mid]==0)swap(nums,low++,mid++);else if(nums[mid]==1)mid++;else if(nums[mid]==2)swap(nums,mid,high--);else throw new IllegalArgumentException("Values must be 0, 1 or 2");}}
 static void swap(int[]nums,int i,int j){int temp=nums[i];nums[i]=nums[j];nums[j]=temp;}
 public static void main(String[]args){Scanner sc=new Scanner(System.in);System.out.print("Enter array size: ");int n=sc.nextInt();if(n<0){System.out.println("Invalid size.");sc.close();return;}int[]nums=new int[n];System.out.println("Enter 0, 1 or 2 values:");for(int i=0;i<n;i++)nums[i]=sc.nextInt();sort(nums);System.out.println(Arrays.toString(nums));sc.close();}
}