import java.util.Scanner;

/** Checks whether text is a palindrome, ignoring punctuation and case. */
public class ValidPalindrome {

    // Two pointers compare characters from both ends.
    static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Skip characters that are not letters or digits.
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare the remaining characters without case sensitivity.
            if (Character.toLowerCase(s.charAt(left))
                    != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

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