package Palindrome;

import java.util.Scanner;

public class FindlengthOfStringWithoutLengthMethod {
    public static int getLengthWithoutLength(String input){
        int position = input.lastIndexOf("");
        return position;
    }

    public static void main(String[] args) {
        // User input for the string to know length
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string to know the length:");

        String userInput= sc.nextLine();

        sc.close();

        System.out.println("You entered: "+userInput);

        System.out.println("Length of string \""+userInput +"\" is :" +getLengthWithoutLength(userInput));



    }
}
