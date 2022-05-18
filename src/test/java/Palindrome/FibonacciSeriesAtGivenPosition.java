package Palindrome;

import java.util.Scanner;

public class FibonacciSeriesAtGivenPosition {
    /*
     * This is called Recursion. When a method calls itself. We must include
     * conditions based exit points to stop recursion. This method has two exit
     * points based on fact that fibonacci series of at index 0 is 0 and 1 at index
     * 1.
     */
    public static int FibonacciAtPosition(int n) {
        // Exit condition as explained above
        if (n == 0) {
            return 0;
        }

        // Exit condition as explained above
        if (n == 1) {
            return 1;
        }

        // This part is actually recursion. We know that fibonacci number at nth position is sum of numbers at positions (n-1) and (n-2).
        /*
         * Suppose method is called as FibonacciAtPosition(5). Below times in sequence
         * with reducing n , FibonacciAtPosition will be called. FibonacciAtPosition(5)
         * = FibonacciAtPosition(4) + FibonacciAtPosition(3) FibonacciAtPosition(3) =
         * FibonacciAtPosition(2) + FibonacciAtPosition(1) FibonacciAtPosition(4) =
         * FibonacciAtPosition(3) + FibonacciAtPosition(2) FibonacciAtPosition(2) =
         * FibonacciAtPosition(1) + FibonacciAtPosition(0) : At this point recurrsion
         * will be stopped and 0+1=1 will ber eturned to immediate caller.
         *
         * and in similar fashion fibonacci(4), fibonacci(3), fibonacci(2) will be
         * recursively called.
         */
        return FibonacciAtPosition(n - 1) + FibonacciAtPosition(n - 2);
    }

    public static void main(String[] args) {

        // User input for the length of fibonacci series
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the position of fibonacci number you want in series where first and second fibonacci numbers are 0 and 1 respectively:");
        int position = sc.nextInt();

        // Closing Scanner
        sc.close();

        // Handling negative length
        if (position <= 0)
            System.out.println("Position can not be negative.");
            // Handling if length is 1
        else {

            System.out.printf("Fibonacci number at position " + position + " is below: \n");

            System.out.print(FibonacciAtPosition(position-1)+" , ");


        }
    }

}
