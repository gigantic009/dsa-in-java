import java.util.Scanner;

/**
 * Checks whether text is a palindrome, ignoring punctuation and case.
 * Comparison is performed on Java char values (UTF-16 code units).
 */
public class ValidPalindrome {

    // Two pointers inspect the next meaningful character from each end.
    // Time: O(n); auxiliary space: O(1).
    static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Ignore punctuation, spaces and other non-alphanumeric characters.
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare the current pair case-insensitively.
            if (Character.toLowerCase(s.charAt(left))
                    != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            // A matching pair is complete; move inward.
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String s = sc.nextLine();

        System.out.println("Palindrome: " + isPalindrome(s));
        sc.close();
    }
}