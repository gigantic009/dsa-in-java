/*
 * Problem: Demonstrate constant-extra-space identification of the element occurring once when every other value occurs exactly twice.
 * LeetCode: #136
 * Companies: Amazon
 * Assumption: The source title is underspecified; this implementation solves the single-number XOR variant.
 */
import java.util.*;
public class SpaceOptimizationBitManipulation {
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int xor=0;for(int i=0;i<n;i++)xor^=s.nextInt();System.out.println(xor);}
}