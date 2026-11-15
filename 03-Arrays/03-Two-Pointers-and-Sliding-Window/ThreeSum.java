/**
 * Question:
 * Given an integer array, print every unique triplet whose sum is zero.
 * Read n followed by n integers from standard input.
 *
 * LeetCode: #15
 *
 * Companies: Adobe, Amazon, Microsoft, Morgan Stanley, Samsung, Snapdeal, Times Internet
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] values) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(values);

        for (int i = 0; i < values.length - 2; i++) {
            if (i > 0 && values[i] == values[i - 1]) continue;

            int left = i + 1;
            int right = values.length - 1;

            while (left < right) {
                long sum = (long) values[i] + values[left] + values[right];

                if (sum < 0) left++;
                else if (sum > 0) right--;
                else {
                    answer.add(Arrays.asList(values[i], values[left], values[right]));
                    left++;
                    right--;
                    while (left < right && values[left] == values[left - 1]) left++;
                    while (left < right && values[right] == values[right + 1]) right--;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) values[i] = scanner.nextInt();

        for (List<Integer> triplet : threeSum(values)) {
            System.out.println(triplet.get(0) + " " + triplet.get(1) + " " + triplet.get(2));
        }
        scanner.close();
    }
}
