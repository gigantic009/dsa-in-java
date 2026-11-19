/*
 * Problem: Find the element that occurs once when every other element
 * occurs exactly twice, using XOR.
 * LeetCode: #136
 * Time: O(n) | Auxiliary space: O(1)
 */

import java.util.Scanner;

public class SpaceOptimizationBitManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        /*
         * XOR has three useful properties here: x ^ x = 0, x ^ 0 = x,
         * and it is associative/commutative. Duplicate pairs therefore cancel,
         * leaving only the value that occurs once.
         */
        for (int i = 0; i < n; i++) {
            int currentNumber = sc.nextInt();
            answer = answer ^ currentNumber;
        }
        System.out.println(answer);
        sc.close();
    }
}
