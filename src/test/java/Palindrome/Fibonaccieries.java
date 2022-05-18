package Palindrome;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonaccieries {
    public static void main(String[] args) {
    // We will use a collection class to store numbers
    ArrayList<Integer> fibonacciSeries = new ArrayList<>();

    // Since first two numbers are 0 and 1 in fibonacci series.
		fibonacciSeries.add(0);
		fibonacciSeries.add(1);

    // User input for the length of fibonacci series
    Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the length of fibonacci serires you want:");
    int length = sc.nextInt();

    // Closing Scanner
		sc.close();

    // Handling negative length
		if (length <= 0)
            System.out.println("Length can not be negative.");
    // Handling if length is 1
		else if (length == 1)
            System.out.println(fibonacciSeries.get(0));
    // Handling if length is 2
		else if (length == 2)
            System.out.println(fibonacciSeries);
		else {

        // Counter starts from 3 as first two numbers in series are 0 and 1.
        for (int i = 3; i <= length; i++) {
            // Since index starts from 0
            fibonacciSeries.add(fibonacciSeries.get(i - 2) + fibonacciSeries.get(i - 3));
        }

        System.out.println("Fibonacci serires of length " + length + " is below:");
        System.out.println(fibonacciSeries);
    }
    }
}
