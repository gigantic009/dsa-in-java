/** Change-making for customers paying $5, $10 or $20 for a $5 drink. */
public class LemonadeChange {
    // Time: O(n); auxiliary space: O(1).
    public static boolean canChange(int[] bills) {
        if (bills == null) {
            throw new IllegalArgumentException("Bills cannot be null.");
        }

        int five = 0;
        int ten = 0;

        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five == 0) {
                    return false;
                }
                five--;
                ten++;
            } else if (bill == 20) {
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(canChange(new int[]{5, 5, 5, 10, 20})); // true
    }
}
