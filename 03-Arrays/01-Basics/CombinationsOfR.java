/*
 * Problem: Print every combination of r elements selected from an array of n elements.
 * LeetCode: Not available
 * Companies: Not listed
 */
import java.util.*;
public class CombinationsOfR {
    static void generate(int[] a,int r,int start,int depth,int[] pick){
        if(depth==r){for(int i=0;i<r;i++)System.out.print(pick[i]+(i+1==r?"\n":" "));return;}
        for(int i=start;i<=a.length-(r-depth);i++){pick[depth]=a[i];generate(a,r,i+1,depth+1,pick);}
    }
    public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=sc.nextInt();int r=sc.nextInt();if(r<0||r>n){System.out.println("Invalid r");return;}generate(a,r,0,0,new int[r]);}
}