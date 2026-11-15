public class ClimbingStairs {
    public static int ways(int n) {
        if (n <= 2) {
            return n;
        }

        int oneStepBefore = 2;
        int twoStepsBefore = 1;

        for (int i = 3; i <= n; i++) {
            int current = oneStepBefore + twoStepsBefore;
            twoStepsBefore = oneStepBefore;
            oneStepBefore = current;
        }

        return oneStepBefore;
    }

    public static void main(String[] args) {
        System.out.println(ways(5));
    }
}
