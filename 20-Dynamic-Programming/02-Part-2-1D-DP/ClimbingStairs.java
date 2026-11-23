/** LeetCode 70: counts ways to climb n stairs using 1- or 2-step moves. */
public class ClimbingStairs {
    public static int ways(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }

        int twoStepsBefore = 1;
        int oneStepBefore = 2;

        for (int i = 3; i <= n; i++) {
            int current = Math.addExact(oneStepBefore, twoStepsBefore);
            twoStepsBefore = oneStepBefore;
            oneStepBefore = current;
        }

        return n == 2 ? 2 : oneStepBefore;
    }

    public static void main(String[] args) {
        System.out.println(ways(5)); // 8
    }
}
