/**
 * Question:
 * Given an integer array and a target value, determine whether any two
 * elements add up to the target. Read n, the array elements, and target
 * from standard input. Print YES if such a pair exists; otherwise print NO.
 *
 * LeetCode: Not available — the source wording does not specify whether
 * indices or the pair itself must be returned.
 *
 * Companies: Infosys, Amazon, Flipkart
 * Time: O(n) average | Auxiliary space: O(n)
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class GivenSumPair {
 public static boolean hasPair(int[] values,long target){Set<Long> seen=new HashSet<>();for(int value:values){long need=target-value;if(seen.contains(need))return true;seen.add((long)value);}return false;}
 public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=sc.nextInt();long target=sc.nextLong();System.out.println(hasPair(a,target)?"YES":"NO");}
}