import java.util.Scanner;

public class BinarySearch {
    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sorted array size: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid size.");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Target: ");
        int target = sc.nextInt();
        System.out.println("Index: " + search(arr, target));

        sc.close();
    }
}
