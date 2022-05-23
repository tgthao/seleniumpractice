package Palindrome;
import java.util.Scanner;

public class ReserveEveryWordOfGroupOfString {
    /*
     * This method splits given string by space delimiter and returns a String
     * array.
     */
    public static String[] splitStringBySpace(String inputStringToSplit) {
        return inputStringToSplit.split(" ");
    }

    /*
     * This method reverse the given word and return it.
     */
    public static String reverseWord(String inputWord) {
        String reverse = "";
        // Reading char by char from end and appending
        for (int i = inputWord.length() - 1; i >= 0; i--) {
            reverse = reverse + inputWord.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {

        // User input for the string to know length
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string to reverse each word:");

        String userInput = sc.nextLine();

        sc.close();

        // Split string
        String[] splitedString = splitStringBySpace(userInput);

        // Output with each word reversed
        String desiredString="";

        // Reversing word by word and appending
        for(int j=0;j<splitedString.length;j++)
        {
            desiredString= desiredString + reverseWord(splitedString[j]) +" ";
        }

        System.out.println("Original string            :"+userInput);

        System.out.println("String with reversed words :"+desiredString);
    }
}
