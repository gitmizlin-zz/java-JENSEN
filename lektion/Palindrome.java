/** Task: Check if the entered data is palindromic.

A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward. 
*/

import java.util.Scanner;

public class Palindrome {
  public static boolean isPalindrome(String str) {
    return str.equals(new StringBuilder(str).reverse().toString());
  }

  public static void main(String[] args) {
    String inputData;
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter text: ");

    inputData = keyboard.nextLine();
    inputData = inputData.replaceAll("[^a-zA-Z0-9]", "");

    if (!isPalindrome(inputData)) {
      System.out.println("Not palindrome.");
    } else {
      System.out.println("Palindrome.");
    }
  }
}
