/** Jump Game: determines if the last index is reachable. */
public class JumpGame {
    public static boolean canReach(int[] jumps) {
        if (jumps == null) throw new IllegalArgumentException("Array cannot be null");
        for (int jump : jumps) if (jump < 0) throw new IllegalArgumentException("Jump lengths must be nonnegative");
        if (jumps.length == 0) return false;

        int farthest = 0;
        for (int i = 0; i < jumps.length; i++) {
            if (i > farthest) return false; // This index cannot be reached.
            long reach = (long) i + jumps[i];
            farthest = (int) Math.min(Integer.MAX_VALUE, Math.max(farthest, reach));
            if (farthest >= jumps.length - 1) return true;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canReach(new int[]{2, 3, 1, 1, 4})); // true
        System.out.println(canReach(new int[]{3, 2, 1, 0, 4})); // false
    }
}