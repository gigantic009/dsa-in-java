import java.util.Scanner;

public class FirstOccurrence {
    public static int find(int[] a, int key, int i) {
        if (a == null || i < 0 || i > a.length) {
            throw new IllegalArgumentException("Array must be non-null and start index non-negative.");
        }
        // Stop when the search reaches the end of the array.
        if (i == a.length) {
            return -1;
        }

        // Return immediately when the key is found.
        if (a[i] == key) {
            return i;
        }

        // Check the next array position recursively.
        return find(a, key, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Array size: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid size");
            sc.close();
            return;
        }

        int[] a = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Search key: ");
        int key = sc.nextInt();

        System.out.println("First index: " + find(a, key, 0));
        sc.close();
    }
}
