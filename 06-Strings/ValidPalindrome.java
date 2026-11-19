/** LeetCode 125: palindrome ignoring punctuation and case. O(n) time, O(1) space. */
public class ValidPalindrome {
    static boolean isPalindrome(String text) {
        int left=0,right=text.length()-1;
        while(left<right) {
            while(left<right&&!Character.isLetterOrDigit(text.charAt(left))) left++;
            while(left<right&&!Character.isLetterOrDigit(text.charAt(right))) right--;
            if(Character.toLowerCase(text.charAt(left))!=Character.toLowerCase(text.charAt(right)))
                return false;
            left++;right--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}