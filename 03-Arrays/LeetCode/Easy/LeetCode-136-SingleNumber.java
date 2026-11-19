/*
 * Problem: Find the element that occurs once when every other element
 * occurs exactly twice, using XOR.
 * LeetCode: #136
 * Time: O(n) | Auxiliary space: O(1)
 */

import java.util.Scanner;

class LeetCode136SingleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        /*
         * XOR cancels pairs (x ^ x = 0), and XOR with zero preserves a value.
         * Therefore every paired number disappears, leaving the unique number.
         */
        for (int i = 0; i < n; i++) {
            int currentNumber = sc.nextInt();
            answer = answer ^ currentNumber;
        }
        System.out.println(answer);
        sc.close();
    }
}
