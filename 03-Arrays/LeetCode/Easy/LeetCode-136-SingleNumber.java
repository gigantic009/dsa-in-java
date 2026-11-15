/*
 * Problem: Find the element that occurs once when every other element
 * occurs exactly twice, using XOR.
 * LeetCode: #136nies: Amazon
 * Assumption: This solves the single-number XOR version.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class LeetCode136SingleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        // Equal numbers cancel each other when XOR is applied.
        for (int i = 0; i < n; i++) {
            int currentNumber = sc.nextInt();
            answer = answer ^ currentNumber;
        }
        System.out.println(answer);
        sc.close();
    }
}
