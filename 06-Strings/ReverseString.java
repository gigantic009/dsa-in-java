/** LeetCode 344: reverse character array in place. O(n) time, O(1) space. */
import java.util.Arrays;
public class ReverseString {
    static void reverse(char[] chars) {
        int left=0, right=chars.length-1; // Start from opposite ends.
        while(left<right) {
            char temp=chars[left]; chars[left]=chars[right]; chars[right]=temp; // Swap.
            left++; right--; // Move inward after swapping.
        }
    }
    public static void main(String[] args) {
        char[] chars={'h','e','l','l','o'};
        reverse(chars);
        System.out.println(Arrays.toString(chars));
    }
}