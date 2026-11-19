import java.util.Scanner;

/**
 * Demonstrates how recursive calls behave while printing numbers.
 *
 * Try tracing the calls for n = 3 before running the program.
 */
public class PrintNumbersRecursion {

    /**
     * Prints numbers from 1 to n.
     *
     * The print statement executes AFTER the recursive call returns,
     * so the output is produced while the call stack unwinds.
     */
    public static void printIncreasing(int n) {
        if (n <= 0) {
            return; // Base case: nothing remains to print.
        }

        printIncreasing(n - 1); // First solve the smaller problem.
        System.out.print(n + " "); // Then print during the return phase.
    }

    /**
     * Prints numbers from n down to 1.
     *
     * The print statement executes BEFORE the recursive call,
     * so output is produced while calls are being created.
     */
    public static void printDecreasing(int n) {
        if (n <= 0) {
            return; // Base case: stop when n reaches zero.
        }

        System.out.print(n + " "); // Print before going deeper.
        printDecreasing(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Enter a non-negative number.");
            sc.close();
            return;
        }

        System.out.print("Decreasing: ");
        printDecreasing(n);
        System.out.println();

        System.out.print("Increasing: ");
        printIncreasing(n);
        System.out.println();

        sc.close();
    }
}

/*
 * Example for n = 3:
 *
 * printDecreasing(3):
 *   print 3 -> call 2
 *   print 2 -> call 1
 *   print 1 -> call 0
 *   Output: 3 2 1
 *
 * printIncreasing(3):
 *   call 2 -> call 1 -> call 0
 *   print 1 -> print 2 -> print 3
 *   Output: 1 2 3
 *
 * Time complexity: O(n), because n recursive calls are made.
 * Auxiliary space: O(n), due to the recursive call stack.
 */
