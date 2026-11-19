import java.util.Scanner;
public class KadaneAlgorithm {
 public static int maxSubarraySum(int[]arr){if(arr.length==0)throw new IllegalArgumentException("Array cannot be empty");int current=arr[0],best=arr[0];for(int i=1;i<arr.length;i++){current=Math.max(arr[i],current+arr[i]);best=Math.max(best,current);}return best;}
 public static void main(String[]args){Scanner sc=new Scanner(System.in);System.out.print("Enter array size: ");int n=sc.nextInt();if(n<=0){System.out.println("Size must be positive.");sc.close();return;}int[]arr=new int[n];System.out.println("Enter elements:");for(int i=0;i<n;i++)arr[i]=sc.nextInt();System.out.println("Maximum subarray sum: "+maxSubarraySum(arr));sc.close();}
}