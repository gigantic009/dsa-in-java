import java.util.Scanner;

/**
 * Reverses a string's UTF-16 char sequence using the two-pointer technique.
 * This beginner implementation reverses char units, not Unicode code points.
 */
public class ReverseString {

    // Mutates the array: each swap fixes two symmetric positions.
    // Time: O(n); auxiliary space: O(1).
    static void reverse(char[] array) {
        int left = 0;
        int right = array.length - 1;

        // The unprocessed region shrinks toward the center after every swap.
        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text to reverse: ");
        char[] array = sc.nextLine().toCharArray();

        reverse(array);
        System.out.println(new String(array));
        sc.close();
    }
}