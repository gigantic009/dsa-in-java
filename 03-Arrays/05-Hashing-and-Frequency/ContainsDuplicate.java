import java.util.HashSet;import java.util.Set;import java.util.Scanner;
public class ContainsDuplicate {
 public static boolean containsDuplicate(int[]arr){Set<Integer>seen=new HashSet<>();for(int value:arr)if(!seen.add(value))return true;return false;}
 public static void main(String[]args){Scanner sc=new Scanner(System.in);System.out.print("Enter array size: ");int n=sc.nextInt();if(n<0){System.out.println("Invalid size.");sc.close();return;}int[]arr=new int[n];System.out.println("Enter elements:");for(int i=0;i<n;i++)arr[i]=sc.nextInt();System.out.println("Contains duplicate: "+containsDuplicate(arr));sc.close();}
}