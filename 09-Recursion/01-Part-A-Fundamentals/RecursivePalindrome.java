// Recursively compare characters moving inward.
// Time: O(n); Space: O(n) recursion depth.
public class RecursivePalindrome {
    public static boolean isPalindrome(String s) {
        if (s == null) throw new IllegalArgumentException("String must not be null");
        return check(s, 0, s.length() - 1);
    }
    private static boolean check(String s, int left, int right) {
        if (left >= right) return true;
        if (s.charAt(left) != s.charAt(right)) return false;
        return check(s, left + 1, right - 1);
    }
    public static void main(String[] args) {
        String sample = "level";
        System.out.println(sample + " is palindrome: " + isPalindrome(sample));
    }
}