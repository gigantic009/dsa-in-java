// Greedy reachability: track the farthest index reachable so far.
public class JumpGame {
    public static boolean canReach(int[] a) {
        for (int jump : a) {
            if (jump < 0) {
                throw new IllegalArgumentException("Jump lengths must be non-negative");
            }
        }

        int farthest = 0;
        for (int i = 0; i < a.length; i++) {
            if (i > farthest) return false;
            long reach = (long) i + a[i];
            farthest = Math.max(farthest, (int) Math.min(Integer.MAX_VALUE, reach));
        }
        return true;
    }
}