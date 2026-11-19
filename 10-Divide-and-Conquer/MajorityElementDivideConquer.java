// Find a majority element using divide-and-conquer.
// Time Complexity: O(n log n) — candidate comparison/counting across recursive levels.
// Space Complexity: O(log n) recursion stack.
public class MajorityElementDivideConquer {
    private static int candidate(int[] a, int left, int right) {
        if (left == right) {
            return a[left];
        }

        int mid = left + (right - left) / 2;
        int x = candidate(a, left, mid);
        int y = candidate(a, mid + 1, right);

        if (x == y) {
            return x;
        }

        // Count both candidates across the combined range.
        int countX = 0, countY = 0;
        for (int i = left; i <= right; i++) {
            if (a[i] == x) {
                countX++;
            }
            if (a[i] == y) {
                countY++;
            }
        }

        return countX > countY ? x : y;
    }

    public static int majority(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int value = candidate(a, 0, a.length - 1);

        // Confirm that the candidate actually appears more than n / 2 times.
        int count = 0;
        for (int num : a) {
            if (num == value) {
                count++;
            }
        }

        if (count <= a.length / 2) {
            throw new IllegalArgumentException("Array has no majority element");
        }
        return value;
    }

    public static void main(String[] args) {
        System.out.println(majority(new int[]{2, 2, 1, 2, 3, 2, 2}));
    }
}
