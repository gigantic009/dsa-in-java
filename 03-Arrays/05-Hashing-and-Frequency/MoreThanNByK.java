/*
 * Problem: Print all elements that occur more than n/k times.
 * LeetCode: Not available
 * Time: O(n) average | Auxiliary space: O(n)
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MoreThanNByK {
    public static List<Integer> findMoreThanNByK(int[] numbers, int k) {
        if (numbers == null || k <= 0) {
            throw new IllegalArgumentException("Array must not be null and k must be positive");
        }

        Map<Integer, Integer> frequency = new HashMap<>();
        for (int number : numbers) {
            frequency.merge(number, 1, Integer::sum);
        }

        List<Integer> answer = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > numbers.length / k) {
                answer.add(entry.getKey());
            }
        }
        Collections.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (n < 0) {
            System.out.println("Array size must be non-negative");
            sc.close();
            return;
        }
        if (k <= 0) {
            System.out.println("k must be positive");
            sc.close();
            return;
        }

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println(findMoreThanNByK(numbers, k));
        sc.close();
    }
}
