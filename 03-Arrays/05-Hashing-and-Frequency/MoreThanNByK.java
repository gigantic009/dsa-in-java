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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (k <= 0) {
            System.out.println("k must be positive");
            sc.close();
            return;
        }
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Count each value's frequency so candidates can be checked against n / k.
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int number : numbers) {
            int oldCount = frequency.getOrDefault(number, 0);
            frequency.put(number, oldCount + 1);
        }

        // Only values with a count strictly greater than the threshold qualify.
        List<Integer> answer = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > n / k) {
                answer.add(entry.getKey());
            }
        }
        // Sort for deterministic, easier-to-read output.
        Collections.sort(answer);
        System.out.println(answer);
        sc.close();
    }
}
