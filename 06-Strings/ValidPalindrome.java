/** LeetCode 125: palindrome ignoring punctuation and case. O(n), O(1). */
public class ValidPalindrome {
    static boolean isPalindrome(String text) {
        int left=0, right=text.length()-1;
        while(left<right) {
            // Skip characters that aren't letters or digits.
            while(left<right&&!Character.isLetterOrDigit(text.charAt(left))) left++;
            while(left<right&&!Character.isLetterOrDigit(text.charAt(right))) right--;
            // Compare lowercase forms so case does not matter.
            if(Character.toLowerCase(text.charAt(left))!=Character.toLowerCase(text.charAt(right)))
                return false;
            left++; right--; // Matching pair: move to next pair.
        }
        return true; // All pairs matched.
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}