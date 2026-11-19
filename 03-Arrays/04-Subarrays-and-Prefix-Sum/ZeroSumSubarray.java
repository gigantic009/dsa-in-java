/*
 * Problem: Determine whether the array contains a non-empty subarray
 * whose sum is zero.
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ZeroSumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Array size must be non-negative");
            sc.close();
            return;
        }
        Set<Long> prefixSums = new HashSet<>();
        prefixSums.add(0L);
        long sum = 0;
        boolean found = false;
        for (int i = 0; i < n; i++) {
            sum += sc.nextLong();
            if (!prefixSums.add(sum)) {
                found = true;
            }
        }
        System.out.println(found ? "Yes" : "No");
        sc.close();
    }
}
