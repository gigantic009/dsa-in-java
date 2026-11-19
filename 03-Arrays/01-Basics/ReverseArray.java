import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid size.");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Use two pointers: one at the start and one at the end.
        int left = 0;
        int right = n - 1;

        // Swap the outer pair and move both pointers toward the center.
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        // The array is reversed in place, so no second array was needed.
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
