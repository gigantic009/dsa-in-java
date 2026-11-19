import java.util.*;

/** Reverses a string using the two-pointer technique. */
public class ReverseString {

    // Reverses the character array in place.
    static void reverse(char[] array) {
        int left = 0;
        int right = array.length - 1;

        // Swap characters until the pointers meet.
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